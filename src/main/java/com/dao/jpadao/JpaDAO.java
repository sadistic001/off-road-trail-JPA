package com.dao.jpadao;

import com.dao.DAO;
import jakarta.persistence.*;

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
        String createQuery =  "SELECT c FROM "+c.getName().substring(c.getName().lastIndexOf('.')+1)+" c WHERE c.id =" + id;
        Query query = em.createQuery(createQuery);
        return (T) query.getSingleResult();
    }

    @Override
    public List<T> findAll(Class c) {
        String createQuery =  "SELECT c FROM "+c.getClass().getName()+" c";
        Query query = em.createQuery(createQuery);
        return query.getResultList();
    }

    @Override
    public boolean update(T obj) {
        try {
            transaction.begin();
            em.persist(obj);
            transaction.commit();
            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();

            if (transaction != null)
            {
                transaction.rollback();
            }
            return false;
        }



    }

    @Override
    public boolean delete(T obj) {
        return false;
    }

    @Override
    public boolean deleteAll() {
        String createQuery =  "DELETE FROM " + this.getClass().getName();
        Query query = em.createQuery(createQuery);
        query.executeUpdate();
        return query.executeUpdate() > 0;
    }

    @Override
    public void close() {
        em.close();
    }
}
