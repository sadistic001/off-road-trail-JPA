package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PointGeographique", schema = "offroad_BSM", catalog = "")
public class E_PointGeographique {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "logitude", nullable = true, precision = 0)
    private Double logitude;
    @Basic
    @Column(name = "lattitude", nullable = true, precision = 0)
    private Double lattitude;
    @Basic
    @Column(name = "commune", nullable = true, length = 255)
    private String commune;
    @Basic
    @Column(name = "region", nullable = true, length = 255)
    private String region;
    @Basic
    @Column(name = "pays", nullable = true, length = 255)
    private String pays;
    @Basic
    @Column(name = "type_de_point", nullable = true)
    private Integer typeDePoint;
    @Basic
    @Column(name = "id_course", nullable = true)
    private Integer idCourse;
    @Basic
    @Column(name = "id_equipement", nullable = true)
    private Integer idEquipement;

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

    public Double getLogitude() {
        return logitude;
    }

    public void setLogitude(Double logitude) {
        this.logitude = logitude;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Integer getTypeDePoint() {
        return typeDePoint;
    }

    public void setTypeDePoint(Integer typeDePoint) {
        this.typeDePoint = typeDePoint;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(Integer idEquipement) {
        this.idEquipement = idEquipement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_PointGeographique that = (E_PointGeographique) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (logitude != null ? !logitude.equals(that.logitude) : that.logitude != null) return false;
        if (lattitude != null ? !lattitude.equals(that.lattitude) : that.lattitude != null) return false;
        if (commune != null ? !commune.equals(that.commune) : that.commune != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;
        if (typeDePoint != null ? !typeDePoint.equals(that.typeDePoint) : that.typeDePoint != null) return false;
        if (idCourse != null ? !idCourse.equals(that.idCourse) : that.idCourse != null) return false;
        if (idEquipement != null ? !idEquipement.equals(that.idEquipement) : that.idEquipement != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (logitude != null ? logitude.hashCode() : 0);
        result = 31 * result + (lattitude != null ? lattitude.hashCode() : 0);
        result = 31 * result + (commune != null ? commune.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (typeDePoint != null ? typeDePoint.hashCode() : 0);
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        result = 31 * result + (idEquipement != null ? idEquipement.hashCode() : 0);
        return result;
    }
}
