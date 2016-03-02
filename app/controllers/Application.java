package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.connexion;
import views.html.index;
import views.html.inscription;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result inscription(){
        return ok(inscription.render());
    }

    public Result connexion(){
        return ok(connexion.render());
    }

    public Result deconnexion(){
        return TODO;
    }

}
