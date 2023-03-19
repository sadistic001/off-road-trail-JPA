package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Commentaire", schema = "offroad_BSM", catalog = "")
public class E_Commentaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "text", nullable = true, length = 255)
    private String text;
    @Basic
    @Column(name = "id_inscription", nullable = true)
    private Integer idInscription;
    @Basic
    @Column(name = "point_geo", nullable = true)
    private Integer pointGeo;
    @Basic
    @Column(name = "date_heure", nullable = true)
    private Timestamp dateHeure;
    @Basic
    @Column(name = "auteur", nullable = true, length = 255)
    private String auteur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public Integer getPointGeo() {
        return pointGeo;
    }

    public void setPointGeo(Integer pointGeo) {
        this.pointGeo = pointGeo;
    }

    public Timestamp getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Timestamp dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Commentaire that = (E_Commentaire) o;

        if (id != that.id) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (idInscription != null ? !idInscription.equals(that.idInscription) : that.idInscription != null)
            return false;
        if (pointGeo != null ? !pointGeo.equals(that.pointGeo) : that.pointGeo != null) return false;
        if (dateHeure != null ? !dateHeure.equals(that.dateHeure) : that.dateHeure != null) return false;
        if (auteur != null ? !auteur.equals(that.auteur) : that.auteur != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (idInscription != null ? idInscription.hashCode() : 0);
        result = 31 * result + (pointGeo != null ? pointGeo.hashCode() : 0);
        result = 31 * result + (dateHeure != null ? dateHeure.hashCode() : 0);
        result = 31 * result + (auteur != null ? auteur.hashCode() : 0);
        return result;
    }
}
