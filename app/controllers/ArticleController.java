package controllers;

import play.mvc.*;

import views.html.*;
import models.Article;
import javax.inject.Inject;
import play.data.FormFactory;
import play.data.Form;

public class ArticleController extends Controller {
  @Inject
  FormFactory formFactory;

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
		Form<Article> articleForm = formFactory.form(Article.class);
    return ok(article_add.render(articleForm));
  }

  public Result update(int id) {
    return ok();
  }

  public Result destroy(int id) {
    return ok();
  }

  public Result create() {
    Article article = formFactory.form(Article.class).bindFromRequest().get();
    article.save();
    return ok();
  }

  public Result revert() {
    return ok();
  }
}

