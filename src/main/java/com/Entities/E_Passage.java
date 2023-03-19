package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Passage", schema = "offroad_BSM", catalog = "")
public class E_Passage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "bracelet", nullable = true)
    private Integer bracelet;
    @Basic
    @Column(name = "equipement", nullable = true)
    private Integer equipement;
    @Basic
    @Column(name = "heure", nullable = true)
    private Timestamp heure;
    @Basic
    @Column(name = "commentaire", nullable = true, length = 255)
    private String commentaire;
    @Basic
    @Column(name = "course", nullable = true)
    private Integer course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBracelet() {
        return bracelet;
    }

    public void setBracelet(Integer bracelet) {
        this.bracelet = bracelet;
    }

    public Integer getEquipement() {
        return equipement;
    }

    public void setEquipement(Integer equipement) {
        this.equipement = equipement;
    }

    public Timestamp getHeure() {
        return heure;
    }

    public void setHeure(Timestamp heure) {
        this.heure = heure;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Passage ePassage = (E_Passage) o;

        if (id != ePassage.id) return false;
        if (bracelet != null ? !bracelet.equals(ePassage.bracelet) : ePassage.bracelet != null) return false;
        if (equipement != null ? !equipement.equals(ePassage.equipement) : ePassage.equipement != null) return false;
        if (heure != null ? !heure.equals(ePassage.heure) : ePassage.heure != null) return false;
        if (commentaire != null ? !commentaire.equals(ePassage.commentaire) : ePassage.commentaire != null)
            return false;
        if (course != null ? !course.equals(ePassage.course) : ePassage.course != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bracelet != null ? bracelet.hashCode() : 0);
        result = 31 * result + (equipement != null ? equipement.hashCode() : 0);
        result = 31 * result + (heure != null ? heure.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }
}
