package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "Inscription", schema = "offroad_BSM", catalog = "")
public class E_Inscription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_course", referencedColumnName = "id")
    private E_Course course;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_coureur", referencedColumnName = "id")
    private E_Coureur coureur;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categorie", referencedColumnName = "id")
    private E_CategorieFfa categorie;
    @Basic
    @Column(name = "etat", nullable = true, length = 255)
    private String etat;
    @Basic
    @Column(name = "dossard", nullable = true, length = 255)
    private String dossard;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bracelet", referencedColumnName = "id")
    private E_Bracelet bracelet;
    @Basic
    @Column(name = "date_inscription", nullable = true)
    private Timestamp dateInscription;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Inscription that = (E_Inscription) o;

        if (id != that.id) return false;
        if (course != null ? !course.equals(that.course) : that.course != null) return false;
        if (coureur != null ? !coureur.equals(that.coureur) : that.coureur != null) return false;
        if (categorie != null ? !categorie.equals(that.categorie) : that.categorie != null) return false;
        if (etat != null ? !etat.equals(that.etat) : that.etat != null) return false;
        if (dossard != null ? !dossard.equals(that.dossard) : that.dossard != null) return false;
        if (bracelet != null ? !bracelet.equals(that.bracelet) : that.bracelet != null) return false;
        if (dateInscription != null ? !dateInscription.equals(that.dateInscription) : that.dateInscription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + (coureur != null ? coureur.hashCode() : 0);
        result = 31 * result + (categorie != null ? categorie.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (dossard != null ? dossard.hashCode() : 0);
        result = 31 * result + (bracelet != null ? bracelet.hashCode() : 0);
        result = 31 * result + (dateInscription != null ? dateInscription.hashCode() : 0);
        return result;
    }
}
