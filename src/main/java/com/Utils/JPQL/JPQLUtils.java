package com.Utils.JPQL;

import com.Entities.E_Competition;
import com.Entities.E_Coureur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    public static List<E_Coureur> getAllCoureurInACategory(int idCategory, EntityManager em){
        Query query = em.createQuery("SELECT c FROM E_Coureur c, E_CategorieFfa cat " +
                "WHERE cat.id = :idCategory AND cat.ageMax >= ( FUNCTION('YEAR', CURRENT_DATE) - " +
                "FUNCTION('YEAR', c.dateNaissance))" +
                "AND cat.ageMin <= ( FUNCTION('YEAR', CURRENT_DATE) - FUNCTION('YEAR', c.dateNaissance))");
       query.setParameter("idCategory", idCategory);
       return query.getResultList();
    }
}
