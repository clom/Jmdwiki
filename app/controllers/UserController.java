package controllers;

import play.mvc.*;

import views.html.*;

public class UserController extends Controller {

  public Result new() {
    return ok(new.render("new"));
  }

  public Result create() {
    return ok(create.render("create"));
  }

  public Result edit(Int id) {
    return ok(edit.render("edit"));
  }
  public Result update(Int id) {
    return ok(update.render("update"));
  }

  public Result destroy(Int id) {
    return ok(destroy.render("destroy"));
  }
