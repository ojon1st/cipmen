package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

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
            case "sahel-delices" :
                return ok(sahel_delices.render());
            case "joboa" :
                return ok(joboa.render());
            case "niger-bioplast" :
                return ok(niger_bioplast.render());
            case "mtmr" :
                return ok(mtmr.render());
            default:
                return redirect("/");
        }

    }
}
