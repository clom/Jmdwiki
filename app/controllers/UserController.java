package controllers;

import play.mvc.*;

import views.html.*;

public class UserController extends Controller {

  public Result add() {
    return ok(add.render("new"));
  }

  public Result edit(int id) {
    return ok(edit.render("edit"));
  }

  public Result create() {
  }

  public Result update(int id) {
  }

  public Result destroy(int id) {

  }
}
