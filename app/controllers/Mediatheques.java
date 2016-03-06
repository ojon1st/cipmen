package controllers;

import models.Mediatheque;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.mediatheques;

/**
 * Created by brabo on 3/2/16.
 */
public class Mediatheques extends Controller {

    @Transactional
    public Result reads() {
        return ok(mediatheques.render(new Mediatheque().findList()));
    }
}
