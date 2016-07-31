package controllers;

import models.User;
import play.api.data.FormError;
import play.data.Form;
import play.mvc.*;
import play.data.FormFactory;

import views.html.*;

import javax.inject.Inject;

public class LoginController extends Controller {

  @Inject
  FormFactory formFactory;

  public Result login() {
    Form<User> loginForm = formFactory.form(User.class);
    return ok(login.render(loginForm, "login"));
  }

  public Result auth(){
    Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
    if(loginForm.hasErrors()){
      return badRequest(login.render(loginForm, "login"));
    }
    try {
      User result = User.authenticate(loginForm.get().getName(), loginForm.get().getPassword());
      if(!result.getName().isEmpty()) {
        session().clear();
        session("name", loginForm.get().name);
        session("id", result.id.toString());
        session("login", "true");
      }
    } catch (java.lang.NullPointerException e){
      session().clear();
    }
    return redirect(routes.ArticleController.index());


  }
}
