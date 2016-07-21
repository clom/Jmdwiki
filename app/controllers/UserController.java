package controllers;

import play.mvc.*;

import views.html.*;

public class UserController extends Controller {

  public Result add() {
    return ok(add.render("new"));
  }

  public Result edit(Int id) {
    return ok(edit.render("edit"));
  }

  public Result create() {
  }

  public Result update(Int id) {
  }

  public Result destroy(Int id) {
  }
}
