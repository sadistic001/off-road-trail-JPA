package com.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Competition", schema = "offroad_BSM", catalog = "")
@NamedQueries({
        @NamedQuery(name = "E_Competition.getAllCompetitions", query = "SELECT c FROM E_Competition c"),
        @NamedQuery(name = "E_Competition.getCompetitionByID", query = "SELECT c FROM E_Competition c " +
                "WHERE c.id = :idCompet")
})
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "id_client", nullable = true)
    private E_Client client;
    @Basic
    @Column(name = "adresse_pc_course", nullable = true, length = 255)
    private String adressePcCourse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Competition that = (E_Competition) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (dateDebut != null ? !dateDebut.equals(that.dateDebut) : that.dateDebut != null) return false;
        if (dateMaxFin != null ? !dateMaxFin.equals(that.dateMaxFin) : that.dateMaxFin != null) return false;
        if (client != null ? !client.equals(that.client) : that.client != null) return false;
        if (adressePcCourse != null ? !adressePcCourse.equals(that.adressePcCourse) : that.adressePcCourse != null)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "E_Competition{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateMaxFin=" + dateMaxFin +
                ", client=" + client.getId() +
                ", adressePcCourse='" + adressePcCourse + '\'' +
                "}\n";
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateMaxFin != null ? dateMaxFin.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (adressePcCourse != null ? adressePcCourse.hashCode() : 0);
        return result;
    }
}
