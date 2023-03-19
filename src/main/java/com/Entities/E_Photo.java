package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Photo", schema = "offroad_BSM", catalog = "")
public class E_Photo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "path", nullable = true, length = 255)
    private String path;
    @Basic
    @Column(name = "id_inscription", nullable = true)
    private Integer idInscription;
    @Basic
    @Column(name = "point_geo", nullable = true)
    private Integer pointGeo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public Integer getPointGeo() {
        return pointGeo;
    }

    public void setPointGeo(Integer pointGeo) {
        this.pointGeo = pointGeo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Photo ePhoto = (E_Photo) o;

        if (id != ePhoto.id) return false;
        if (name != null ? !name.equals(ePhoto.name) : ePhoto.name != null) return false;
        if (path != null ? !path.equals(ePhoto.path) : ePhoto.path != null) return false;
        if (idInscription != null ? !idInscription.equals(ePhoto.idInscription) : ePhoto.idInscription != null)
            return false;
        if (pointGeo != null ? !pointGeo.equals(ePhoto.pointGeo) : ePhoto.pointGeo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (idInscription != null ? idInscription.hashCode() : 0);
        result = 31 * result + (pointGeo != null ? pointGeo.hashCode() : 0);
        return result;
    }
}
