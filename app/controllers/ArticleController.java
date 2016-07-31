package controllers;

import com.avaje.ebean.Expr;
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
    return ok(show.render(id, data.getTitle(), data.getContent().replaceAll("(\r\n|\r|\n)","\\\\r\\\\n")));
  }

  public Result edit(int id) {
    Article data = Article.find.byId(id);
    Form<Article> articleForm = formFactory.form(Article.class).fill(data);
    return ok(article_edit.render(articleForm, id));
  }

  public Result add() {
		Form<Article> articleForm = formFactory.form(Article.class);
    return ok(article_add.render(articleForm));
  }

  public Result update(int id) {

    Article request = formFactory.form(Article.class).bindFromRequest().get();
    Article article = Article.find.byId(id);
    article.setTitle(request.getTitle());
    article.setContent(request.getContent());
    article.update();

    return redirect("/article/" + article.getArticleId());
  }

  public Result destroy(int id) {


    Article article = Article.find.byId(id);
    article.delete();
    List<Article> articles = Article.find.all();
    return ok(article_index.render(articles));

  }

  public Result create() {
    Form<Article> requestForm = formFactory.form(Article.class).bindFromRequest();
    if(requestForm.hasErrors()){
      return ok(article_add.render(requestForm));
    }else{
      Article article = requestForm.get();
      article.save();
      return redirect("/article/" + article.getArticleId());
    }
  }

  public Result search(String keyword){
    List<Article> article = Article.find.where().or(Expr.like("title", "%"+ keyword +"%"), Expr.like("content", "%"+ keyword +"%")).findList();
    return ok(search.render(article, keyword));
  }

  public Result revert() {
    return ok();
  }
}

