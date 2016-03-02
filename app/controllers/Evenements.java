package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.evenement;
import views.html.evenements;

/**
 * Created by brabo on 3/2/16.
 */
public class Evenements extends Controller {

    public Result reads() {
        return ok(evenements.render());
    }

    public Result read(String nom) {
        return ok(evenement.render());
    }
}
