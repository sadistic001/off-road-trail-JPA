package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PointGeographique", schema = "offroad_BSM", catalog = "")
@Getter
@Setter
public class E_PointGeographique {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "logitude", nullable = true, precision = 0)
    private Double logitude;
    @Basic
    @Column(name = "lattitude", nullable = true, precision = 0)
    private Double lattitude;
    @Basic
    @Column(name = "commune", nullable = true, length = 255)
    private String commune;
    @Basic
    @Column(name = "region", nullable = true, length = 255)
    private String region;
    @Basic
    @Column(name = "pays", nullable = true, length = 255)
    private String pays;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_de_point", referencedColumnName = "id", nullable = false)
    private E_TypePoint typeDePoint;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_course", referencedColumnName = "id", nullable = false)
    private E_Course course;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipement", referencedColumnName = "id", nullable = false)
    private E_Equipement equipement;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_PointGeographique that = (E_PointGeographique) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (logitude != null ? !logitude.equals(that.logitude) : that.logitude != null) return false;
        if (lattitude != null ? !lattitude.equals(that.lattitude) : that.lattitude != null) return false;
        if (commune != null ? !commune.equals(that.commune) : that.commune != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;
        if (typeDePoint != null ? !typeDePoint.equals(that.typeDePoint) : that.typeDePoint != null) return false;
        if (course != null ? !course.equals(that.course) : that.course != null) return false;
        if (equipement != null ? !equipement.equals(that.equipement) : that.equipement != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (logitude != null ? logitude.hashCode() : 0);
        result = 31 * result + (lattitude != null ? lattitude.hashCode() : 0);
        result = 31 * result + (commune != null ? commune.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (typeDePoint != null ? typeDePoint.hashCode() : 0);
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + (equipement != null ? equipement.hashCode() : 0);
        return result;
    }
}
