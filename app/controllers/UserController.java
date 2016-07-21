package controllers;

import play.mvc.*;

import views.html.*;

public class UserController extends Controller {

  public Result add() {
    return ok(user_add.render("new"));
  }

  public Result create() {
      return ok();
  }

  public Result edit(int id) {
    return ok(user_edit.render("article_edit"));
  }
  public Result update(int id) {
      return ok();
  }

  public Result destroy(int id) {
      return ok();
  }
}
