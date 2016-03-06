package controllers;

import models.Newsletter;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by brabo on 3/4/16.
 */
public class Newsletters extends Controller {
    @Transactional
    public Result create() {
        Form<Newsletter> form = Form.form(Newsletter.class).bindFromRequest();
        if (form.hasErrors()) {
            flash("newslettererror", "Erreur d'inscription, veuillez vérifier les données saisies");
            return redirect("/");
        } else {
            Newsletter newsletter = form.get();
            String result = newsletter.create(newsletter);
            if (result != null) {
                flash("newslettererror", "Cet email est déjà enregistré, veuillez utiliser un autre compte");
                return redirect("/");
            } else {
                flash("newslettersuccess", "Vous êtes enregistré à la newsletter");
                return redirect("/");
            }
        }
    }

}
