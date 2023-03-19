package com.test.JPQL;

import com.Entities.E_Competition;
import jakarta.persistence.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager em = factory.createEntityManager();
        Query query = em.createNamedQuery("E_Competition.getCompetitionByID");
        query.setParameter("idCompet", 1);
        E_Competition competitions = (E_Competition) query.getSingleResult();
        System.out.println("La compétiton ayant les informations suivantes :  " + competitions);
        query = em.createNamedQuery("E_Course.getCompetitionTotalDistance");
        query.setParameter("idCompet", 1);
        System.out.println(" a comme distance maximale : " + (double) query.getSingleResult());


    }
}
