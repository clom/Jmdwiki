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

  public Result edit() {
    return ok(edit.render("edit"));
  }
  public Result update() {
    return ok(update.render("update"));
  }

  public Result destroy() {
    return ok(destroy.render("destroy"));
  }
