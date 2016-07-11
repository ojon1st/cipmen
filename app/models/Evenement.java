package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by brabo on 3/4/16.
 */
@Entity
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "titre")
    private String titre;
    @Column(name = "lien")
    private String lien;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "long_description")
    private String longDescription;
    @Column(name = "image_one")
    private String imageOne;
    @Column(name = "image_two")
    private String imageTwo;
    @Column(name = "image_tree")
    private String imageTree;
    @Column(name = "video")
    private String video;

    /**
     * Constructor with arguments
     * @param titre
     * @param lien
     * @param shortDescription
     * @param longDescription
     * @param imageOne
     * @param imageTwo
     * @param imageTree
     * @param video
     */
    public Evenement(String titre, String lien, String shortDescription, String longDescription, String imageOne, String imageTwo, String imageTree, String video) {
        this.titre = titre;
        this.lien = lien;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.imageOne = imageOne;
        this.imageTwo = imageTwo;
        this.imageTree = imageTree;
        this.video = video;
    }

    /**
     * Constructor withoud arguments
     */
    public Evenement() {
    }

    /**
     * Liste des evenements
     *
     * @return
     */
    public List<Evenement> findList() {
        try {
            return JPA.em().createQuery("select evenement From Evenement evenement order by evenement.id desc").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Retrouver une evenement en fonction de son id
     *
     * @param id
     * @return
     */
    public Evenement findById(Long id) {
        try {
            return (Evenement) JPA.em().createQuery("select evenement From Evenement evenement WHERE evenement.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Find Evenement by lien
     * @param lien
     * @return
     */
    public Evenement findByLien(String lien) {
        try {
            return (Evenement) JPA.em().createQuery("select evenement From Evenement evenement WHERE evenement.lien = :lien").setParameter("lien", lien).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Enregistrement d'une evenement
     *
     * @param evenement
     * @return
     */
    public String create(Evenement evenement) {
        String result = null;
        try {
            JPA.em().persist(evenement);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Mise à jour de la evenement
     *
     * @param evenement
     * @return
     */
    public String update(Evenement evenement) {
        String result = null;
        try {
            JPA.em().persist(evenement);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Suppression de la evenement
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Evenement evenement = new Evenement().findById(id);
        if (evenement == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(evenement);
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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getImageOne() {
        return imageOne;
    }

    public void setImageOne(String imageOne) {
        this.imageOne = imageOne;
    }

    public String getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(String imageTwo) {
        this.imageTwo = imageTwo;
    }

    public String getImageTree() {
        return imageTree;
    }

    public void setImageTree(String imageTree) {
        this.imageTree = imageTree;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
