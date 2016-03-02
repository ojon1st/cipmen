package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.incubateur;

/**
 * Created by brabo on 3/2/16.
 */
public class Incubateurs extends Controller {

    public Result reads() {
        return ok(incubateur.render());
    }
}
