package controllers;

import models.pojo.Contact;
import play.data.Form;
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

    public Result create(){
        Form<Contact> form = Form.form(Contact.class).bindFromRequest();
        if (form.hasErrors()) {
            flash("contacterror", "Erreur d'inscription, veuillez vérifier les données saisies");
            return redirect("/");
        } else {
            Contact contact = form.get();
            contact.getNewsletter();

            return TODO;
        }
    }
}
