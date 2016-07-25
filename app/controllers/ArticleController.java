package controllers;

import play.mvc.*;

import views.html.*;
import models.Article;
import java.util.*;
import javax.inject.Inject;
import play.data.FormFactory;
import play.data.Form;

public class ArticleController extends Controller {
  @Inject
  FormFactory formFactory;

  public Result index() {
    List<Article> articles = Article.find.all();
    return ok(article_index.render(articles));
  }

  public Result show(int id) {
    Article data = Article.find.where().eq("articleId", id).findUnique();
    return ok(show.render(data.getTitle(), data.getContent().replaceAll("(\r\n|\r|\n)","\\\\r\\\\n")));
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
    return redirect("/article/" + article.getArticleId());
  }

  public Result revert() {
    return ok();
  }
}

