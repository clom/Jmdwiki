package controllers;

import play.mvc.*;

import views.html.*;

public class LogoutController extends Controller {
  public Result logout() {
    return ok(logout.render("logout"));
  }
}