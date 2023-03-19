package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Competition", schema = "offroad_BSM", catalog = "")
public class E_Competition {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "date_debut", nullable = true)
    private Timestamp dateDebut;
    @Basic
    @Column(name = "date_max_fin", nullable = true)
    private Timestamp dateMaxFin;
    @Basic
    @Column(name = "id_client", nullable = true)
    private Integer idClient;
    @Basic
    @Column(name = "adresse_pc_course", nullable = true, length = 255)
    private String adressePcCourse;

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

    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Timestamp getDateMaxFin() {
        return dateMaxFin;
    }

    public void setDateMaxFin(Timestamp dateMaxFin) {
        this.dateMaxFin = dateMaxFin;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getAdressePcCourse() {
        return adressePcCourse;
    }

    public void setAdressePcCourse(String adressePcCourse) {
        this.adressePcCourse = adressePcCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Competition that = (E_Competition) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (dateDebut != null ? !dateDebut.equals(that.dateDebut) : that.dateDebut != null) return false;
        if (dateMaxFin != null ? !dateMaxFin.equals(that.dateMaxFin) : that.dateMaxFin != null) return false;
        if (idClient != null ? !idClient.equals(that.idClient) : that.idClient != null) return false;
        if (adressePcCourse != null ? !adressePcCourse.equals(that.adressePcCourse) : that.adressePcCourse != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateMaxFin != null ? dateMaxFin.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (adressePcCourse != null ? adressePcCourse.hashCode() : 0);
        return result;
    }
}
