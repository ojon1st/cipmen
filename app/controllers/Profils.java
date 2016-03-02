package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.profil;

/**
 * Created by brabo on 3/2/16.
 */
public class Profils extends Controller {
    public Result reads() {
        return ok(profil.render());
    }
}

