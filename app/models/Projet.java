package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by brabo on 4/25/16.
 */
@Entity
@Table(name = "projet")
public class Projet {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private Long telephone;
    @Column(name = "age")
    private Long age;
    @Column(name = "residence")
    private String residence;
    @Column(name = "diplome")
    private String diplome;
    @Column(name = "experience")
    private String experience;
    @Column(name = "entrepreneur_existant")
    private String entrepreneurExistant;
    @Column(name = "entrepreneur_future")
    private String entrepreneurFuture;
    @Column(name = "fichier")
    private String fichier;

    /**
     * Liste des projets
     *
     * @return
     */
    public List<Projet> findList() {
        try {
            return JPA.em().createQuery("select projet From Projet projet").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Retrouver une projet en fonction de son id
     *
     * @param id
     * @return
     */
    public Projet findById(Long id) {
        try {
            return (Projet) JPA.em().createQuery("select projet From Projet projet WHERE projet.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    /**
     * Enregistrement d'une projet
     *
     * @param projet
     * @return
     */
    public String create(Projet projet) {
        String result = null;
        try {
            JPA.em().persist(projet);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Suppression de la projet
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Projet projet = new Projet().findById(id);
        if (projet == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(projet);
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

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEntrepreneurExistant() {
        return entrepreneurExistant;
    }

    public void setEntrepreneurExistant(String entrepreneurExistant) {
        this.entrepreneurExistant = entrepreneurExistant;
    }

    public String getEntrepreneurFuture() {
        return entrepreneurFuture;
    }

    public void setEntrepreneurFuture(String entrepreneurFuture) {
        this.entrepreneurFuture = entrepreneurFuture;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }
}
