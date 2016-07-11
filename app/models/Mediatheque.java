package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by brabo on 3/4/16.
 */
@Entity
@Table(name = "mediatheque")
public class Mediatheque {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "type")      // photo, video
    private String type;
    @Column(name = "image")
    private String image;
    @Column(name = "video")
    private String video;

    /**
     * Constructor with arguments
     * @param type
     * @param image
     * @param video
     */
    public Mediatheque(String type, String image, String video) {
        this.type = type;
        this.image = image;
        this.video = video;
    }

    /**
     * Constructor without arguments
     */
    public Mediatheque() {
    }

    /**
     * Liste des mediatheques
     *
     * @return
     */
    public List<Mediatheque> findList() {
        try {
            return JPA.em().createQuery("select mediatheque From Mediatheque mediatheque  order by mediatheque.id desc").getResultList();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Retrouver une mediatheque en fonction de son id
     *
     * @param id
     * @return
     */
    public Mediatheque findById(Long id) {
        try {
            return (Mediatheque) JPA.em().createQuery("select mediatheque From Mediatheque mediatheque WHERE mediatheque.id = :id").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Enregistrement d'une mediatheque
     *
     * @param mediatheque
     * @return
     */
    public String create(Mediatheque mediatheque) {
        String result = null;
        try {
            JPA.em().persist(mediatheque);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Mise à jour de la mediatheque
     *
     * @param mediatheque
     * @return
     */
    public String update(Mediatheque mediatheque) {
        String result = null;
        try {
            JPA.em().persist(mediatheque);
        } catch (Exception e) {
            System.out.println(e.toString());
            result = e.toString();
        }
        return result;
    }

    /**
     * Suppression de la mediatheque
     *
     * @param id
     * @return
     */
    public String delete(Long id) {
        String result = null;
        Mediatheque mediatheque = new Mediatheque().findById(id);
        if (mediatheque == null) {
            return "aucun enregistrement correspondant";
        } else {
            try {
                JPA.em().remove(mediatheque);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}

