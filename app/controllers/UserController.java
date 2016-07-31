package controllers;

import models.Article;
import play.data.FormFactory;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import models.User;

import javax.inject.Inject;

public class UserController extends Controller {
  @Inject
  FormFactory formFactory;

  public Result add() {
    Form<User> userForm = formFactory.form(User.class);
    return ok(user_add.render("new", userForm));
  }

  public Result edit(Long id) {
    User data = User.find.byId(id);
    Form<User> userForm = formFactory.form(User.class).fill(data);
    return ok(user_edit.render("UserEdit.", userForm));
  }

  public Result create() {
    User user = formFactory.form(User.class).bindFromRequest().get();
    user.save();
    return redirect(routes.ArticleController.index());
  }

  public Result update(Long id) {
    User request = formFactory.form(User.class).bindFromRequest().get();
    User user = User.find.byId(id);
    user.setName(request.getName());
    user.setPassword(request.getPassword());
    user.update();

    return redirect(routes.ArticleController.index());
  }

  public Result destroy(Long id) {
    User user = User.find.byId(id);
    user.delete();
    session().clear();
    return redirect(routes.ArticleController.index());
  }
}
