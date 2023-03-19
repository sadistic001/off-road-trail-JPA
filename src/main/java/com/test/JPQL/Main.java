package com.test.JPQL;

import com.Entities.E_Competition;
import com.Utils.JPQL.JPQLUtils;
import jakarta.persistence.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager em = factory.createEntityManager();
        System.out.println("distance maximale de la course 1 : " + JPQLUtils.competionTotatleDistance(1, em));
        em.close();



    }
}
