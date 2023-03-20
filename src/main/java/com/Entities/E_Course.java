package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Course", schema = "offroad_BSM", catalog = "")
@Getter
@Setter
@NamedQueries({
        // Permet d'obtenir toutes les courses d'une competition
        @NamedQuery(name = "E_Course.getCoursesByCompetitionID", query = "SELECT c FROM E_Course c " +
                "WHERE c.competition.id = :idCompet"),
        @NamedQuery(name = "E_Course.getCompetitionsByCategorie", query = "SELECT c FROM E_Course c " +
                "JOIN c.categories cat WHERE cat.id = :idCategorie"),
        @NamedQuery( name = "E_Course.terminerCourse", query = "UPDATE E_Course c " +
                "SET c.terminee = true WHERE c.id = :idCourse")
})
public class E_Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "heure_depart", nullable = true)
    private Timestamp heureDepart;
    @Basic
    @Column(name = "distance", nullable = true, precision = 0)
    private Double distance;
    @Basic
    @Column(name = "duree_max", nullable = true, precision = 0)
    private Double dureeMax;

    @Basic
    @Column(name = "terminee", nullable = true)
    private boolean terminee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_competition", nullable = true)
    private E_Competition competition;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "nature_course", nullable = true)
    private E_Nature natureCourse;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "point_depart", nullable = true)
    private E_PointGeographique pointDepart;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "point_arrivee", nullable = true)
    private E_PointGeographique pointArrivee;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Ouvrir",
            joinColumns = @JoinColumn(name = "course"),
            inverseJoinColumns = @JoinColumn(name = "categorie"))
    private Set<E_CategorieFfa> categories;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Course eCourse = (E_Course) o;

        if (id != eCourse.id) return false;
        if (nom != null ? !nom.equals(eCourse.nom) : eCourse.nom != null) return false;
        if (heureDepart != null ? !heureDepart.equals(eCourse.heureDepart) : eCourse.heureDepart != null) return false;
        if (distance != null ? !distance.equals(eCourse.distance) : eCourse.distance != null) return false;
        if (dureeMax != null ? !dureeMax.equals(eCourse.dureeMax) : eCourse.dureeMax != null) return false;
        if (competition != null ? !competition.equals(eCourse.competition) : eCourse.competition != null)
            return false;
        if (natureCourse != null ? !natureCourse.equals(eCourse.natureCourse) : eCourse.natureCourse != null)
            return false;
        if (pointDepart != null ? !pointDepart.equals(eCourse.pointDepart) : eCourse.pointDepart != null) return false;
        if (pointArrivee != null ? !pointArrivee.equals(eCourse.pointArrivee) : eCourse.pointArrivee != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (heureDepart != null ? heureDepart.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (dureeMax != null ? dureeMax.hashCode() : 0);
        result = 31 * result + (competition != null ? competition.hashCode() : 0);
        result = 31 * result + (natureCourse != null ? natureCourse.hashCode() : 0);
        result = 31 * result + (pointDepart != null ? pointDepart.hashCode() : 0);
        result = 31 * result + (pointArrivee != null ? pointArrivee.hashCode() : 0);
        return result;
    }
}
