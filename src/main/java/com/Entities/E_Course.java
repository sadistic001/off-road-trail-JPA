package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Course", schema = "offroad_BSM", catalog = "")
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
    @Column(name = "id_competition", nullable = true)
    private Integer idCompetition;
    @Basic
    @Column(name = "nature_course", nullable = true)
    private Integer natureCourse;
    @Basic
    @Column(name = "point_depart", nullable = true)
    private Integer pointDepart;
    @Basic
    @Column(name = "point_arrivee", nullable = true)
    private Integer pointArrivee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Timestamp getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Timestamp heureDepart) {
        this.heureDepart = heureDepart;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDureeMax() {
        return dureeMax;
    }

    public void setDureeMax(Double dureeMax) {
        this.dureeMax = dureeMax;
    }

    public Integer getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(Integer idCompetition) {
        this.idCompetition = idCompetition;
    }

    public Integer getNatureCourse() {
        return natureCourse;
    }

    public void setNatureCourse(Integer natureCourse) {
        this.natureCourse = natureCourse;
    }

    public Integer getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(Integer pointDepart) {
        this.pointDepart = pointDepart;
    }

    public Integer getPointArrivee() {
        return pointArrivee;
    }

    public void setPointArrivee(Integer pointArrivee) {
        this.pointArrivee = pointArrivee;
    }

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
        if (idCompetition != null ? !idCompetition.equals(eCourse.idCompetition) : eCourse.idCompetition != null)
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
        result = 31 * result + (idCompetition != null ? idCompetition.hashCode() : 0);
        result = 31 * result + (natureCourse != null ? natureCourse.hashCode() : 0);
        result = 31 * result + (pointDepart != null ? pointDepart.hashCode() : 0);
        result = 31 * result + (pointArrivee != null ? pointArrivee.hashCode() : 0);
        return result;
    }
}
