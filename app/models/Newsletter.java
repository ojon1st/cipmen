package models;

import play.data.validation.Constraints;
import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by brabo on 3/4/16.
 */
@Entity
@Table(name = "newsletter")
public class Newsletter {
    @Id
    @GeneratedValue
    private Long id;
    @Constraints.Required
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Constraints.Required
    @Column(name = "nom")
    private String nom;

    /**
     * Liste des newsletters
     *
     * @return
     */
    public List<Newsletter> findList() {
        try {
            return JPA.em().createQuery("select newsletter From Newsletter newsletter").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Retrouver une newsletter en fonction de son id
     *
     * @param id
     * @return
     */
    public Newsletter findById(Long id) {
        try {
            return (Newsletter) JPA.em().createQuery("select newsletter From Newsletter newsletter WHERE newsletter.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    /**
     * Find Newsletter by email
     * @param email
     * @return
     */
    public Newsletter findByEmail(String email) {
        try {
            return (Newsletter) JPA.em().createQuery("select newsletter From Newsletter newsletter WHERE newsletter.email = :email").setParameter("email", email).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Enregistrement d'une newsletter
     *
     * @param newsletter
     * @return
     */
    public String create(Newsletter newsletter) {
        String result = null;
        try {
            JPA.em().persist(newsletter);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Suppression de la newsletter
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Newsletter newsletter = new Newsletter().findById(id);
        if (newsletter == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(newsletter);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
