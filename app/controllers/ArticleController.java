package controllers;

import play.mvc.*;

import views.html.*;
import models.Article;
import java.util.*;

public class ArticleController extends Controller {
  public Result index() {
    List<Article> articles = Article.find.all();
    return ok(article_index.render(articles));
  }

  public Result show(Long id) {
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

