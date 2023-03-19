package com.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "Client", schema = "offroad_BSM", catalog = "")
@Data
public class E_Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "adresse", nullable = true, length = 255)
    private String adresse;
    @Basic
    @Column(name = "type_client", nullable = true, length = 255)
    private String typeClient;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Client eClient = (E_Client) o;

        if (id != eClient.id) return false;
        if (nom != null ? !nom.equals(eClient.nom) : eClient.nom != null) return false;
        if (adresse != null ? !adresse.equals(eClient.adresse) : eClient.adresse != null) return false;
        if (typeClient != null ? !typeClient.equals(eClient.typeClient) : eClient.typeClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (typeClient != null ? typeClient.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", typeClient='" + typeClient +'\'' +
                '}';
    }
}
