package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Inscription", schema = "offroad_BSM", catalog = "")
public class E_Inscription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_course", nullable = true)
    private Integer idCourse;
    @Basic
    @Column(name = "id_coureur", nullable = true)
    private Integer idCoureur;
    @Basic
    @Column(name = "id_categorie", nullable = true)
    private Integer idCategorie;
    @Basic
    @Column(name = "etat", nullable = true, length = 255)
    private String etat;
    @Basic
    @Column(name = "dossard", nullable = true, length = 255)
    private String dossard;
    @Basic
    @Column(name = "bracelet", nullable = true)
    private Integer bracelet;
    @Basic
    @Column(name = "date_inscription", nullable = true)
    private Timestamp dateInscription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getIdCoureur() {
        return idCoureur;
    }

    public void setIdCoureur(Integer idCoureur) {
        this.idCoureur = idCoureur;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDossard() {
        return dossard;
    }

    public void setDossard(String dossard) {
        this.dossard = dossard;
    }

    public Integer getBracelet() {
        return bracelet;
    }

    public void setBracelet(Integer bracelet) {
        this.bracelet = bracelet;
    }

    public Timestamp getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Timestamp dateInscription) {
        this.dateInscription = dateInscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Inscription that = (E_Inscription) o;

        if (id != that.id) return false;
        if (idCourse != null ? !idCourse.equals(that.idCourse) : that.idCourse != null) return false;
        if (idCoureur != null ? !idCoureur.equals(that.idCoureur) : that.idCoureur != null) return false;
        if (idCategorie != null ? !idCategorie.equals(that.idCategorie) : that.idCategorie != null) return false;
        if (etat != null ? !etat.equals(that.etat) : that.etat != null) return false;
        if (dossard != null ? !dossard.equals(that.dossard) : that.dossard != null) return false;
        if (bracelet != null ? !bracelet.equals(that.bracelet) : that.bracelet != null) return false;
        if (dateInscription != null ? !dateInscription.equals(that.dateInscription) : that.dateInscription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        result = 31 * result + (idCoureur != null ? idCoureur.hashCode() : 0);
        result = 31 * result + (idCategorie != null ? idCategorie.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (dossard != null ? dossard.hashCode() : 0);
        result = 31 * result + (bracelet != null ? bracelet.hashCode() : 0);
        result = 31 * result + (dateInscription != null ? dateInscription.hashCode() : 0);
        return result;
    }
}
