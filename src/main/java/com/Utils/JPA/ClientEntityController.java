package com.Utils.JPA;

import com.Entities.E_Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ClientEntityController {
    protected static final String PERSISTENCE_UNIT_NAME = "default";
    protected static EntityManagerFactory factory;
    protected static EntityManager em;

    protected static EntityTransaction transaction ;
    public ClientEntityController() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        transaction = em.getTransaction();
    }

    public E_Client getClientById(int id) {
        return em.find(E_Client.class, id);
    }
}
