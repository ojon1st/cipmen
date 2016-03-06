package controllers;

import controllers.utils.Secured;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.profil;

/**
 * Created by brabo on 3/2/16.
 */
public class Profils extends Controller {

    @Transactional
    @Security.Authenticated(Secured.class)
    public Result reads() {
        return ok(profil.render());
    }
}

