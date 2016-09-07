package controllers;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.candidature;


public class Candidatures extends Controller {

    @Transactional
    public Result read() {
        return ok(candidature.render());
    }

}
