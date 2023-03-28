package com.dao;

import com.Entities.E_Competition;

public interface DaoCompetition extends DAO<E_Competition> {

    public int nombreCourses(int id);

    public E_Competition find( int id) ;

}
