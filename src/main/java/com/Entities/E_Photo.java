package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Photo", schema = "offroad_BSM", catalog = "")
@Setter
@Getter
public class E_Photo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_inscription", nullable = true)
    private E_Inscription inscription;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "point_geo", nullable = true)
    private E_PointGeographique pointGeo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Photo ePhoto = (E_Photo) o;

        if (id != ePhoto.id) return false;
        if (name != null ? !name.equals(ePhoto.name) : ePhoto.name != null) return false;
        if (inscription != null ? !inscription.equals(ePhoto.inscription) : ePhoto.inscription != null)
            return false;
        if (pointGeo != null ? !pointGeo.equals(ePhoto.pointGeo) : ePhoto.pointGeo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (inscription != null ? inscription.hashCode() : 0);
        result = 31 * result + (pointGeo != null ? pointGeo.hashCode() : 0);
        return result;
    }
}
