package controllers;

import play.data.FormFactory;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import models.User;

import javax.inject.Inject;

public class UserController extends Controller {
  @Inject
  FormFactory formFactory;

  public Result add() {
    Form<User> userForm = formFactory.form(User.class);
    return ok(user_add.render("new", userForm));
  }

  public Result edit(int id) {
    return ok(user_edit.render("article_edit"));
  }

  public Result create() {
    return ok();
  }

  public Result update(int id) {
    return ok();
  }

  public Result destroy(int id) {
    return ok();
  }
}
