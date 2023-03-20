package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Ouvrir", schema = "offroad_BSM", catalog = "")
@Getter
@Setter
public class E_Ouvrir {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course", referencedColumnName = "id", nullable = false)
    private E_Course course;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie", referencedColumnName = "id", nullable = false)
    private E_CategorieFfa categorie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Ouvrir eOuvrir = (E_Ouvrir) o;

        if (course != eOuvrir.course) return false;
        if (categorie != eOuvrir.categorie) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = course.hashCode();
        result = 31 * result + categorie.hashCode();
        return result;
    }
}
