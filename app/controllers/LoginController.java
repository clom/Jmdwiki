package controllers;

import models.User;
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
}
