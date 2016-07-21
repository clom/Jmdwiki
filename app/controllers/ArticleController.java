package controllers;

import play.mvc.*;

import views.html.*;

public class ArticleController extends Controller {
  public Result index() {
    return ok(index.render("index"));
  }

  public Result show(int id) {
    return ok(show.render("show"));
  }

  public Result edit(int id) {
    return ok(edit.render("edit"));
  }

  public Result add() {
    return ok(add.render("new"));
  }

  public Result update(int id) {
  }

  public Result destroy(int id) {
  }

  public Result create() {
  }

  public Result revert() {
  }
}

