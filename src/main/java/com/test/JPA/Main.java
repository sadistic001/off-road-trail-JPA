package com.test.JPA;

import com.Utils.JPA.CoureurEntityController;
import com.Entities.E_Coureur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Timestamp;

public class Main {
    final static String PERSISTENCE_UNIT_NAME = "default";
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        CoureurEntityController manager = new CoureurEntityController();
        E_Coureur coureur = manager.getCoureurbyId(1, em);
        System.out.println(coureur.toString());
        E_Coureur newCoureur = new E_Coureur("addedLoginnn", "pwd",
                "try.tryyy@try.com", "Sadik", "Mouad",
                "Male", new Timestamp(101, 06, 10, 0, 0, 0, 0));
        int id = manager.insertCoureur(newCoureur, em, transaction);
        coureur = manager.getCoureurbyId(id, em);
        System.out.println(coureur.toString());
        E_Coureur newCour = new E_Coureur();
        newCour.setTelephone("0628773812");
        manager.updateCoureur(id, newCour, em, transaction);
        coureur = manager.getCoureurbyId(id, em);
        System.out.println(coureur.toString());
        manager.deleteCoureurById(id, em);
        if(!manager.coureurExists(id, em)) System.out.println("element : "+ id+ "  n'existe plus, comme prévu");

        manager.closeEM(em);





    }

}
