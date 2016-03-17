package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.apkode;
import views.html.startup;
import views.html.stratetic;

/**
 * Created by brabo on 3/2/16.
 */
public class Startups extends Controller {

    public Result reads() {
        return TODO;
    }

    public Result read(String nom) {

        switch (nom){
            case "stratetic" :
                return ok(stratetic.render());
            case "apkode" :
                return ok(apkode.render());
            default:
                return redirect("/");
        }

    }
}
