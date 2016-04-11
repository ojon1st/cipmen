package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

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
            case "e3d" :
                return ok(e3d.render());
            case "itechcom" :
                return ok(itechcom.render());
            case "icon" :
                return ok(icon.render());
            case "gimafor" :
                return ok(gimafor.render());
            case "novateh" :
                return ok(novatech.render());
            case "tech-innov" :
                return ok(techinnov.render());
            default:
                return redirect("/");
        }

    }
}
