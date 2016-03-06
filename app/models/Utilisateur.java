package models;

import models.pojo.User;
import play.data.validation.Constraints;
import play.db.jpa.JPA;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by brabo on 3/2/16.
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue
    private Long id;
    @Constraints.Required
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Constraints.Required
    @Column(name = "nom")
    private String nom;

    @Column(name = "password", length = 64, nullable = false)
    private byte[] password;
    @Column(name = "profil")
    private String profil;

    @Transient
    @Constraints.MinLength(6)
    @Constraints.MaxLength(256)
    private String pass;


    /**
     * Constructor with arguments
     *
     * @param email
     * @param nom
     * @param password
     * @param profil
     */
    public Utilisateur(String email, String nom, String password, String profil) {
        this.email = email;
        this.nom = nom;
        this.password = getSha512(password);
        this.profil = profil;
    }

    /**
     * Constructor empty
     */
    public Utilisateur() {
    }

    /**
     * @param password
     * @return
     */
    public static byte[] getSha512(String password) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(password.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Find utilisateur
     *
     * @return
     */
    public List<Utilisateur> findList() {
        try {
            return JPA.em().createQuery("select utilisateur From Utilisateur utilisateur").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Find utilisateur by id
     *
     * @param id
     * @return
     */
    public Utilisateur findById(Long id) {
        try {
            return (Utilisateur) JPA.em().createQuery("select utilisateur From Utilisateur utilisateur WHERE utilisateur.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Create utilisateur
     *
     * @param utilisateur
     * @return
     */
    public String create(Utilisateur utilisateur) {
        String result = null;

        utilisateur.setPassword(getSha512(utilisateur.getPass()));

        try {
            JPA.em().persist(utilisateur);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Delete utilisateur
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Utilisateur utilisateur = new Utilisateur().findById(id);
        if (utilisateur == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(utilisateur);
            } catch (Exception e) {
                System.out.println(e.toString());
                result = e.toString();
            }
            return result;
        }
    }

    /**
     * Find utilisateur by email and password
     *
     * @param user
     * @return
     */
    public Utilisateur authentification(User user) {
        try {
            return (Utilisateur) JPA.em().createQuery("select utilisateur From Utilisateur utilisateur WHERE utilisateur.email = :email and utilisateur.password = :password").setParameter("email", user.getEmail()).setParameter("password", getSha512(user.getPassword())).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }
}
