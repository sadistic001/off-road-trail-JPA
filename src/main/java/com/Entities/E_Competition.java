package com.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@Table(name = "Competition", schema = "offroad_BSM", catalog = "")
@NamedQueries({
        @NamedQuery(name = "E_Competition.getAllCompetitions", query = "SELECT c FROM E_Competition c"),
        @NamedQuery(name = "E_Competition.getCompetitionByID", query = "SELECT c FROM E_Competition c " +
                "WHERE c.id = :idCompet"),
        // Permet la distance totale d'une categorie
        @NamedQuery(name = "E_Competition.getCompetitionTotalDistance", query = "SELECT SUM(c.distance) FROM E_Course c " +
                "WHERE c.competition.id = :idCompet"),
        @NamedQuery(name = "E_Competition.getNombreCourses", query = "SELECT COUNT(c) FROM E_Course c " +
                "WHERE c.competition.id = :idCompet"),
})
public class E_Competition {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "date_debut", nullable = true)
    private Timestamp dateDebut;
    @Basic
    @Column(name = "date_max_fin", nullable = true)
    private Timestamp dateMaxFin;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_client", nullable = true)
    private E_Client client;
    @Basic
    @Column(name = "adresse_pc_course", nullable = true, length = 255)
    private String adressePcCourse;
    @OneToMany(mappedBy = "competition")
    private Set<E_Course> courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Competition that = (E_Competition) o;
        return id == that.id && nom.equals(that.nom) && dateDebut.equals(that.dateDebut)
                && dateMaxFin.equals(that.dateMaxFin) && client.equals(that.client) &&
                adressePcCourse.equals(that.adressePcCourse) && courses.equals(that.courses);
    }

    @Override
    public String toString() {
        return "E_Competition{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateMaxFin=" + dateMaxFin +
                ", client=" + client.getId() +
                ", adressePcCourse='" + adressePcCourse + '\'' +
                "}\n";
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateMaxFin != null ? dateMaxFin.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (adressePcCourse != null ? adressePcCourse.hashCode() : 0);
        return result;
    }
}
