package controllers;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.incubation;
import views.html.pre_incubation;


public class Candidatures extends Controller {

    @Transactional
    public Result readIncubation() {
        return ok(incubation.render());
    }

    @Transactional
    public Result readPreIncubation() {
        return ok(pre_incubation.render());
    }

}
