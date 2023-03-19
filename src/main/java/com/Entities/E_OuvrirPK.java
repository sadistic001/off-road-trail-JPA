package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class E_OuvrirPK implements Serializable {
    @Column(name = "course", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course;
    @Column(name = "categorie", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        E_OuvrirPK eOuvrirPK = (E_OuvrirPK) o;

        if (course != eOuvrirPK.course) return false;
        if (categorie != eOuvrirPK.categorie) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = course;
        result = 31 * result + categorie;
        return result;
    }
}
