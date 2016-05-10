package controllers;

import models.Utilisateur;
import models.pojo.User;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.connexion;
import views.html.index;
import views.html.inscription;


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
                flash("error", "Votre email existe déjà, veuillez vous connecter avec ou utiliser un autre");
                return redirect("/inscription");
            } else {
                return redirect("/connexion");
            }
        }
    }


    @Transactional
    public Result authentification() {
        Form<User> form = Form.form(User.class);

        if (form.hasErrors()) {
            flash("error", " Email ou mot de passe incorrect. Veuillez saisir à nouveau");
            return redirect("/connexion");
        } else {
            User user = form.bindFromRequest().get();
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

    public Result sendemain() {
        sendEmail();
        return TODO;
    }

    public void sendEmail() {
       /* String cid = "1234";
        Email email = new Email()
                .setSubject("Simple email")
                .setFrom("Mister FROM <from@email.com>")
                .addTo("Miss TO <to@email.com>")
                        // adds attachment
                .addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"))
                        // adds inline attachment from byte array
                .addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE)
                        // adds cid attachment
                .addAttachment("image.jpg", new File("/some/path/image.jpg"), cid)
                        // sends text, HTML or both...
                .setBodyText("A text message")
                .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
        mailerClient.send(email);*/
    }

}


