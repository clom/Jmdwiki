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

  public Result add() {
    return ok(add.render("new"));
  }

  public Result update(Int id) {
  }

  public Result destroy(Int id) {
  }

  public Result create() {
  }

  public Result revert() {
  }
}

