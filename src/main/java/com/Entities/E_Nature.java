package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Nature", schema = "offroad_BSM", catalog = "")
public class E_Nature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nature", nullable = true, length = 255)
    private String nature;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Nature eNature = (E_Nature) o;

        if (id != eNature.id) return false;
        if (nature != null ? !nature.equals(eNature.nature) : eNature.nature != null) return false;
        if (description != null ? !description.equals(eNature.description) : eNature.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nature != null ? nature.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
