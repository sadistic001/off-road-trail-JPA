package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Setter
@Getter
@Table(name = "Passage", schema = "offroad_BSM", catalog = "")
public class E_Passage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bracelet", referencedColumnName = "id", nullable = false)
    private E_Bracelet bracelet;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipement", referencedColumnName = "id", nullable = false)
    private E_Equipement equipement;
    @Basic
    @Column(name = "heure", nullable = true)
    private Timestamp heure;
    @Basic
    @Column(name = "commentaire", nullable = true, length = 255)
    private String commentaire;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course", referencedColumnName = "id", nullable = false)
    private E_Course course;

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
