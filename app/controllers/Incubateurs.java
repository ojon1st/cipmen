package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.offre;
import views.html.presentation;
import views.html.team;

/**
 * Created by brabo on 3/2/16.
 */
public class Incubateurs extends Controller {

    public Result presentation() {
        return ok(presentation.render());
    }

    public Result offre() {
        return ok(offre.render());
    }

    public Result team() {
        return ok(team.render());
    }
}
