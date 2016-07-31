package controllers;

import play.mvc.*;

import views.html.*;

public class LogoutController extends Controller {
  public Result logout() {
    session().clear();
    return redirect(routes.ArticleController.index());
  }
}
