package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Commentaire", schema = "offroad_BSM", catalog = "")
@Setter
@Getter
@NamedQuery(name = "E_Commentaire.getCommentairesByHashtag", query = "SELECT comm " +
        "FROM E_Commentaire comm JOIN comm.hashtag h WHERE h.hashtag = :hashtag")
public class E_Commentaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "text", nullable = true, length = 255)
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_inscription", nullable = true)
    private E_Inscription inscription;
    @Basic
    @Column(name = "point_geo", nullable = true)
    private Integer pointGeo;
    @Basic
    @Column(name = "date_heure", nullable = true)
    private Timestamp dateHeure;
    @Basic
    @Column(name = "auteur", nullable = true, length = 255)
    private String auteur;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Commentaire_hashtag",
            joinColumns = @JoinColumn(name = "commentaire"),
            inverseJoinColumns = @JoinColumn(name = "hashtag"))
    private Set<E_Hashtag> hashtag;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Commentaire that = (E_Commentaire) o;

        if (id != that.id) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (inscription != null ? !inscription.equals(that.inscription) : that.inscription != null)
            return false;
        if (pointGeo != null ? !pointGeo.equals(that.pointGeo) : that.pointGeo != null) return false;
        if (dateHeure != null ? !dateHeure.equals(that.dateHeure) : that.dateHeure != null) return false;
        if (auteur != null ? !auteur.equals(that.auteur) : that.auteur != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "E_Commentaire{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", inscription=" + inscription +
                ", pointGeo=" + pointGeo +
                ", dateHeure=" + dateHeure +
                ", auteur='" + auteur + '\'' +
                ", hashtag=" + hashtag +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (inscription != null ? inscription.hashCode() : 0);
        result = 31 * result + (pointGeo != null ? pointGeo.hashCode() : 0);
        result = 31 * result + (dateHeure != null ? dateHeure.hashCode() : 0);
        result = 31 * result + (auteur != null ? auteur.hashCode() : 0);
        return result;
    }
}
