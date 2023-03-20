package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CategorieFFA", schema = "offroad_BSM", catalog = "")
@Getter
@Setter
public class E_CategorieFfa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "label", nullable = true, length = 255)
    private String label;
    @Basic
    @Column(name = "sexe", nullable = true, length = 255)
    private String sexe;
    @Basic
    @Column(name = "age_max", nullable = true)
    private Integer ageMax;
    @Basic
    @Column(name = "age_min", nullable = true)
    private Integer ageMin;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_CategorieFfa that = (E_CategorieFfa) o;

        if (id != that.id) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (sexe != null ? !sexe.equals(that.sexe) : that.sexe != null) return false;
        if (ageMax != null ? !ageMax.equals(that.ageMax) : that.ageMax != null) return false;
        if (ageMin != null ? !ageMin.equals(that.ageMin) : that.ageMin != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
        result = 31 * result + (ageMax != null ? ageMax.hashCode() : 0);
        result = 31 * result + (ageMin != null ? ageMin.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
