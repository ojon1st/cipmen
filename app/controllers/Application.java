package controllers;

import models.Utilisateur;
import models.pojo.User;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.connexion;
import views.html.index;
import views.html.inscription;
import java.util.*;


public class Application extends Controller {

    @Transactional
    public Result index() {
        Utilisateur utilisateur = new Utilisateur("bachir2@bachir.com", "Bob", "123123", "user");
        //  utilisateur.create(utilisateur);
        return ok(index.render());
    }

    public Result inscription(){
        return ok(inscription.render());
    }

    public Result connexion(){
        return ok(connexion.render());
    }

    public Result deconnexion(){
        session().clear();
        flash("success", "Vous êtes déconnecté");
        return redirect("/");
    }

    @Transactional
    public Result create() {
        Form<Utilisateur> form = Form.form(Utilisateur.class).bindFromRequest();
        if (form.hasErrors()) {
            return redirect("/inscription");
        } else {
            Utilisateur utilisateur = form.get();
            utilisateur.setProfil("user");
            String result = utilisateur.create(utilisateur);
            if (result != null) {
                return redirect("/inscription");
            } else {
                return redirect("/connexion");
            }
        }
    }


    @Transactional
    public Result authentification() {
        Form<User> form = Form.form(User.class);
        User user = form.bindFromRequest().get();

        if (form.hasErrors()) {
            flash("error", " Email ou mot de passe incorrect. Veuillez saisir à nouveau");
            return redirect("/connexion");
        } else {
            if ((new Utilisateur()).authentification(user) == null) {
                flash("error", " Email ou mot de passe incorrect. Ce utilisateur n'a pas été enregistré dans la base de donnée");
                return redirect("/connexion");
            } else {
                flash("success", " Vous êtes authentifié");
                session("email", (new Utilisateur()).authentification(user).getEmail());
                session("profil", (new Utilisateur()).authentification(user).getProfil());
                return redirect("/profil");
            }
        }
    }



}


