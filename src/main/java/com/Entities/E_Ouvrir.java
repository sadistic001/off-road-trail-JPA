package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ouvrir", schema = "offroad_BSM", catalog = "")
@IdClass(E_OuvrirPK.class)
public class E_Ouvrir {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "course", nullable = false)
    private int course;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "categorie", nullable = false)
    private int categorie;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

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
        int result = course;
        result = 31 * result + categorie;
        return result;
    }
}
