package controllers;

import models.Postule;
import play.data.Form;
import play.db.jpa.Transactional;
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

    @Transactional
    public Result create() {
        Form<Postule> form = Form.form(Postule.class).bindFromRequest();
        if (form.hasErrors()) {
            flash("postuleerror", "Erreur d'inscription, veuillez vérifier les données saisies");
            return redirect("/postule");
        } else {
            Postule postule = form.get();
            String result = postule.create(postule);
            if (result != null) {
                flash("postuleerror", "Erreur d'inscription, veuillez vérifier les données saisies");
                return redirect("/postule");
            } else {
                flash("postulesuccess", "Vous demande a été envyée");
                return redirect("/postule");
            }
        }
    }
    
}
