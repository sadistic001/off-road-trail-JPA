package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Troncon", schema = "offroad_BSM", catalog = "")
public class E_Troncon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "numero", nullable = true)
    private Integer numero;
    @Basic
    @Column(name = "point_depart", nullable = true)
    private Integer pointDepart;
    @Basic
    @Column(name = "point_arrivee", nullable = true)
    private Integer pointArrivee;
    @Basic
    @Column(name = "delai_max", nullable = true, precision = 0)
    private Double delaiMax;
    @Basic
    @Column(name = "duree_alerte", nullable = true, precision = 0)
    private Double dureeAlerte;
    @Basic
    @Column(name = "id_course", nullable = true)
    private Integer idCourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Double getDelaiMax() {
        return delaiMax;
    }

    public void setDelaiMax(Double delaiMax) {
        this.delaiMax = delaiMax;
    }

    public Double getDureeAlerte() {
        return dureeAlerte;
    }

    public void setDureeAlerte(Double dureeAlerte) {
        this.dureeAlerte = dureeAlerte;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Troncon eTroncon = (E_Troncon) o;

        if (id != eTroncon.id) return false;
        if (numero != null ? !numero.equals(eTroncon.numero) : eTroncon.numero != null) return false;
        if (pointDepart != null ? !pointDepart.equals(eTroncon.pointDepart) : eTroncon.pointDepart != null)
            return false;
        if (pointArrivee != null ? !pointArrivee.equals(eTroncon.pointArrivee) : eTroncon.pointArrivee != null)
            return false;
        if (delaiMax != null ? !delaiMax.equals(eTroncon.delaiMax) : eTroncon.delaiMax != null) return false;
        if (dureeAlerte != null ? !dureeAlerte.equals(eTroncon.dureeAlerte) : eTroncon.dureeAlerte != null)
            return false;
        if (idCourse != null ? !idCourse.equals(eTroncon.idCourse) : eTroncon.idCourse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (pointDepart != null ? pointDepart.hashCode() : 0);
        result = 31 * result + (pointArrivee != null ? pointArrivee.hashCode() : 0);
        result = 31 * result + (delaiMax != null ? delaiMax.hashCode() : 0);
        result = 31 * result + (dureeAlerte != null ? dureeAlerte.hashCode() : 0);
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        return result;
    }
}
