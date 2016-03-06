package controllers;

import models.Evenement;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.evenement;
import views.html.evenements;

/**
 * Created by brabo on 3/2/16.
 */
public class Evenements extends Controller {

    @Transactional
    public Result reads() {
        return ok(evenements.render(new Evenement().findList()));
    }

    @Transactional
    public Result read(String lien) {
        return ok(evenement.render(new Evenement().findByLien(lien)));
    }
}
