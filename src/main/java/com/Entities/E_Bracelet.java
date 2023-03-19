package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Bracelet", schema = "offroad_BSM", catalog = "")
public class E_Bracelet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "rfid", nullable = true)
    private Integer rfid;
    @Basic
    @Column(name = "est_disponible", nullable = true)
    private Byte estDisponible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }

    public Byte getEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(Byte estDisponible) {
        this.estDisponible = estDisponible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Bracelet eBracelet = (E_Bracelet) o;

        if (id != eBracelet.id) return false;
        if (rfid != null ? !rfid.equals(eBracelet.rfid) : eBracelet.rfid != null) return false;
        if (estDisponible != null ? !estDisponible.equals(eBracelet.estDisponible) : eBracelet.estDisponible != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (rfid != null ? rfid.hashCode() : 0);
        result = 31 * result + (estDisponible != null ? estDisponible.hashCode() : 0);
        return result;
    }
}
