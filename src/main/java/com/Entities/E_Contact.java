package com.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Contact", schema = "offroad_BSM", catalog = "")
public class E_Contact {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "prenom", nullable = true, length = 255)
    private String prenom;
    @Basic
    @Column(name = "numero_telephone", nullable = true, length = 255)
    private String numeroTelephone;
    @Basic
    @Column(name = "adresse_mail", nullable = true, length = 255)
    private String adresseMail;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private E_Client idClient;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Contact eContact = (E_Contact) o;

        if (id != eContact.id) return false;
        if (nom != null ? !nom.equals(eContact.nom) : eContact.nom != null) return false;
        if (prenom != null ? !prenom.equals(eContact.prenom) : eContact.prenom != null) return false;
        if (numeroTelephone != null ? !numeroTelephone.equals(eContact.numeroTelephone) : eContact.numeroTelephone != null)
            return false;
        if (adresseMail != null ? !adresseMail.equals(eContact.adresseMail) : eContact.adresseMail != null)
            return false;
        if (description != null ? !description.equals(eContact.description) : eContact.description != null)
            return false;
        if (idClient != null ? !idClient.equals(eContact.idClient) : eContact.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (numeroTelephone != null ? numeroTelephone.hashCode() : 0);
        result = 31 * result + (adresseMail != null ? adresseMail.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Contact{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ", description='" + description + '\'' +
                ", idClient=" + idClient +
                '}';
    }
}
