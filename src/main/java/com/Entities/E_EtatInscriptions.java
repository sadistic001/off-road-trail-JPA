package com.Entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "etat_inscriptions", schema = "offroad_BSM", catalog = "")
public class E_EtatInscriptions {
    @Basic
    @Column(name = "Competition", nullable = true, length = 255)
    private String competition;
    @Basic
    @Column(name = "Course", nullable = true, length = 255)
    private String course;
    @Basic
    @Column(name = "Insciption_valid", nullable = false)
    private long insciptionValid;
    @Basic
    @Column(name = "Insciption_en_attent", nullable = false)
    private long insciptionEnAttent;

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public long getInsciptionValid() {
        return insciptionValid;
    }

    public void setInsciptionValid(long insciptionValid) {
        this.insciptionValid = insciptionValid;
    }

    public long getInsciptionEnAttent() {
        return insciptionEnAttent;
    }

    public void setInsciptionEnAttent(long insciptionEnAttent) {
        this.insciptionEnAttent = insciptionEnAttent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_EtatInscriptions that = (E_EtatInscriptions) o;

        if (insciptionValid != that.insciptionValid) return false;
        if (insciptionEnAttent != that.insciptionEnAttent) return false;
        if (competition != null ? !competition.equals(that.competition) : that.competition != null) return false;
        if (course != null ? !course.equals(that.course) : that.course != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = competition != null ? competition.hashCode() : 0;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + (int) (insciptionValid ^ (insciptionValid >>> 32));
        result = 31 * result + (int) (insciptionEnAttent ^ (insciptionEnAttent >>> 32));
        return result;
    }
}
