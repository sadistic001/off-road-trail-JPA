package com.dao.jpadao;

import com.Entities.E_Competition;
import com.dao.DaoCompetition;
import jakarta.persistence.*;

public class JpaDaoCompetition extends JpaDAO<E_Competition> implements DaoCompetition {

    @Override
    public int nombreCourses(int id) {
        Query query = em.createNamedQuery("E_Competition.getNombreCourses");
        query.setParameter("idCompet", id);
        return (int)query.getSingleResult();
    }

    @Override
    public E_Competition find(int id) {
        return find(E_Competition.class, id);
    }
}
