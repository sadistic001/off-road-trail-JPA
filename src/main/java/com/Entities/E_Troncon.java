package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Troncon", schema = "offroad_BSM", catalog = "")
@Setter
@Getter
public class E_Troncon {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "numero", nullable = true)
    private Integer numero;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "point_depart", nullable = true)
    private E_PointGeographique pointDepart;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "point_arrivee", nullable = true)
    private E_PointGeographique pointArrivee;
    @Basic
    @Column(name = "delai_max", nullable = true, precision = 0)
    private Double delaiMax;
    @Basic
    @Column(name = "duree_alerte", nullable = true, precision = 0)
    private Double dureeAlerte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_course", nullable = false)
    private E_Course course;


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
        if (course != null ? !course.equals(eTroncon.course) : eTroncon.course != null) return false;

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
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }
}
