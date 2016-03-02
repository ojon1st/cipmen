package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.startup;

/**
 * Created by brabo on 3/2/16.
 */
public class Startups extends Controller {

    public Result reads() {
        return TODO;
    }

    public Result read(String nom) {
        return ok(startup.render());
    }
}
