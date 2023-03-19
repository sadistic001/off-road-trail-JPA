package com.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Coureur", schema = "offroad_BSM", catalog = "")
public class E_Coureur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "login", nullable = true, length = 255)
    private String login;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    @Basic
    @Column(name = "adresse", nullable = true, length = 255)
    private String adresse;
    @Basic
    @Column(name = "telephone", nullable = true, length = 255)
    private String telephone;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "prenom", nullable = true, length = 255)
    private String prenom;
    @Basic
    @Column(name = "sexe", nullable = true, length = 255)
    private String sexe;
    @Basic
    @Column(name = "date_naissance", nullable = true)
    private Timestamp dateNaissance;
    @Basic
    @Column(name = "licence", nullable = true, length = 255)
    private String licence;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Coureur eCoureur = (E_Coureur) o;

        if (id != eCoureur.id) return false;
        if (login != null ? !login.equals(eCoureur.login) : eCoureur.login != null) return false;
        if (password != null ? !password.equals(eCoureur.password) : eCoureur.password != null) return false;
        if (adresse != null ? !adresse.equals(eCoureur.adresse) : eCoureur.adresse != null) return false;
        if (telephone != null ? !telephone.equals(eCoureur.telephone) : eCoureur.telephone != null) return false;
        if (nom != null ? !nom.equals(eCoureur.nom) : eCoureur.nom != null) return false;
        if (prenom != null ? !prenom.equals(eCoureur.prenom) : eCoureur.prenom != null) return false;
        if (sexe != null ? !sexe.equals(eCoureur.sexe) : eCoureur.sexe != null) return false;
        if (dateNaissance != null ? !dateNaissance.equals(eCoureur.dateNaissance) : eCoureur.dateNaissance != null)
            return false;
        if (licence != null ? !licence.equals(eCoureur.licence) : eCoureur.licence != null) return false;

        return true;
    }

    public E_Coureur(String login, String password, String adresse, String nom, String prenom, String sexe, Timestamp dateNaissance) {
        this.login = login;
        this.password = password;
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
        result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
        result = 31 * result + (licence != null ? licence.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Coureur{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", licence='" + licence + '\'' +
                '}';
    }
}
