package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.mediatheques;

/**
 * Created by brabo on 3/2/16.
 */
public class Mediatheques extends Controller {

    public Result reads() {
        return ok(mediatheques.render());
    }
}
