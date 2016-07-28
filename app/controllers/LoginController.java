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
    session().clear();
    session("name", loginForm.get().name);
    session("login", "true");
    return redirect(routes.ArticleController.index());


  }
}
