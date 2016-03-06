package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by brabo on 3/4/16.
 */
@Entity
@Table(name = "postule")
public class Postule {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "type")
    private String type;
    @Column(name = "descrition")
    private String description;
    @Column(name = "probleme")
    private String probleme;
    @Column(name = "clientele")
    private String clientele;
    @Column(name = "stade")
    private String stade;
    @Column(name = "frein")
    private String frein;
    @Column(name = "attente")
    private String attente;

    /**
     * Liste des postules
     *
     * @return
     */
    public List<Postule> findList() {
        try {
            return JPA.em().createQuery("select postule From Postule postule").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Retrouver une postule en fonction de son id
     *
     * @param id
     * @return
     */
    public Postule findById(Long id) {
        try {
            return (Postule) JPA.em().createQuery("select postule From Postule postule WHERE postule.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    /**
     * Enregistrement d'une postule
     *
     * @param postule
     * @return
     */
    public String create(Postule postule) {
        String result = null;
        try {
            JPA.em().persist(postule);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Suppression de la postule
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Postule postule = new Postule().findById(id);
        if (postule == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(postule);
            } catch (Exception e) {
                System.out.println(e.toString());
                result = e.toString();
            }
            return result;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProbleme() {
        return probleme;
    }

    public void setProbleme(String probleme) {
        this.probleme = probleme;
    }

    public String getClientele() {
        return clientele;
    }

    public void setClientele(String clientele) {
        this.clientele = clientele;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public String getFrein() {
        return frein;
    }

    public void setFrein(String frein) {
        this.frein = frein;
    }

    public String getAttente() {
        return attente;
    }

    public void setAttente(String attente) {
        this.attente = attente;
    }
}

