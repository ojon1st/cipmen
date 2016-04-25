package controllers;

import models.Projet;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.projet_safo;

/**
 * Created by brabo on 4/25/16.
 */
public class Projets extends Controller {
    @Transactional
    public Result readSafo() {
        return ok(projet_safo.render());
    }

    @Transactional
    public Result create() {
        Form<Projet> form = Form.form(Projet.class).bindFromRequest();
        if (form.hasErrors()) {
            flash("projeterror", "Erreur d'inscription, veuillez vérifier les données saisies");
            return redirect("/projet/safo");
        } else {
            Projet projet = form.get();
            String result = projet.create(projet);
            if (result != null) {
                flash("projeterror", "Erreur d'inscription, veuillez vérifier les données saisies");
                return redirect("/projet/safo");
            } else {
                flash("projetsuccess", "Vous demande a été envyée");
                return redirect("/");
            }
        }
    }
    
}
