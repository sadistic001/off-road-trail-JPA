package com.dao.jpadao;

import com.Entities.E_Competition;
import com.dao.daoCompetition;

public class jpaDaoCompetition extends JpaDAO<E_Competition> implements daoCompetition {


    @Override
    public int nombreCourses() {
        return 0;
    }
}
