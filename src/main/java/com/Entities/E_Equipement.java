package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Equipement", schema = "offroad_BSM", catalog = "")
public class E_Equipement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "numero_de_serie", nullable = true, length = 255)
    private String numeroDeSerie;
    @Basic
    @Column(name = "type", nullable = true, length = 255)
    private String type;
    @Basic
    @Column(name = "date_debut_service", nullable = true)
    private Timestamp dateDebutService;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getDateDebutService() {
        return dateDebutService;
    }

    public void setDateDebutService(Timestamp dateDebutService) {
        this.dateDebutService = dateDebutService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Equipement that = (E_Equipement) o;

        if (id != that.id) return false;
        if (numeroDeSerie != null ? !numeroDeSerie.equals(that.numeroDeSerie) : that.numeroDeSerie != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (dateDebutService != null ? !dateDebutService.equals(that.dateDebutService) : that.dateDebutService != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numeroDeSerie != null ? numeroDeSerie.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (dateDebutService != null ? dateDebutService.hashCode() : 0);
        return result;
    }
}
