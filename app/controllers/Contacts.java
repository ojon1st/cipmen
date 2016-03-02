package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.contacts;

/**
 * Created by brabo on 3/2/16.
 */
public class Contacts extends Controller {
    public Result reads() {
        return ok(contacts.render());
    }
}
