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
    return ok(article_edit.render("edit"));
  }

  public Result add() {
    return ok(article_add.render("new"));
  }

  public Result update(int id) {
    return ok();
  }

  public Result destroy(int id) {
    return ok();
  }

  public Result create() {
    return ok();
  }

  public Result revert() {
    return ok();
  }
}

