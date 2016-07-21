package controllers;

import play.mvc.*;

import views.html.*;

public class ArticleController extends Controller {
  public Result index() {
    return ok(index.render("index"));
  }

  public Result show(Int id) {
    return ok(show.render("show"));
  }

  public Result edit(Int id) {
    return ok(edit.render("edit"));
  }

  public Result new() {
    return ok(new.render("new"));
  }

  public Result update(Int id) {
    return ok(update.render("update"));
  }

  public Result destroy(Int id) {
    return ok(destroy.render("destroy"));
  }

  public Result create() {
    return ok(create.render("create"));
  }

  public Result revert() {
    return ok(revert.render("revert"));
  }
}

