package com.Utils.JPQL;

import com.Entities.E_Competition;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class JPQLUtils {


    public static double competionTotatleDistance(int id, EntityManager em){
        Query query = em.createNamedQuery("E_Competition.getCompetitionByID");
        query.setParameter("idCompet", 1);
        E_Competition competitions = (E_Competition) query.getSingleResult();
        System.out.println("Informations sur la compétition :  " + competitions);
        query = em.createNamedQuery("E_Competition.getCompetitionTotalDistance");
        query.setParameter("idCompet", 1);
        return (double) query.getSingleResult();
    }
}
