package com.dao.jpadao;

import com.dao.DAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

abstract class JpaDAO<T> implements DAO<T> {


    final static String PERSISTANCE_UNIT_NAME  = "default";
    EntityManagerFactory factory ;
    EntityManager em ;
    EntityTransaction transaction;


    public JpaDAO(){
        factory = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
        em = factory.createEntityManager();
        transaction = em.getTransaction();
    }
    @Override
    public boolean create(T obj) {
        return false;
    }

    @Override
    public T find(Class c, int id) {
        return null;
    }

    @Override
    public List<T> findAll(Class c) {
        return null;
    }

    @Override
    public boolean update(T obj) {
        return false;
    }

    @Override
    public boolean delete(T obj) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public void close() {

    }
}
