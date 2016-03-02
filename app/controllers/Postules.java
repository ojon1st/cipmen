package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.postule;

/**
 * Created by brabo on 3/2/16.
 */
public class Postules extends Controller {
    public Result reads() {
        return ok(postule.render());
    }
}
