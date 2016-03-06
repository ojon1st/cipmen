package models.pojo;

/**
 * Created by brabo on 3/5/16.
 */
public class Contact {
    private String nom;
    private String message;
    private String destinataire;
    private String expediteur;
    private Long newsletter;

    public Contact(String nom, String message, String destinataire, String expediteur, Long newsletter) {
        this.nom = nom;
        this.message = message;
        this.destinataire = destinataire;
        this.expediteur = expediteur;
        this.newsletter = newsletter;
    }

    public Contact() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public Long getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Long newsletter) {
        this.newsletter = newsletter;
    }
}
