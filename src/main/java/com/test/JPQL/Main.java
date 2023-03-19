package com.test.JPQL;

import com.Entities.E_Commentaire;
import com.Entities.E_Competition;
import com.Entities.E_Coureur;
import com.Utils.JPQL.JPQLUtils;
import jakarta.persistence.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager em = factory.createEntityManager();
        System.out.println("distance maximale de la course 1 : " + JPQLUtils.competionTotatleDistance(1, em));

        System.out.println("On affiche maintenant tous les joeurs appartenants à une catégorie");
        List<E_Coureur> coureurs = JPQLUtils.getAllCoureurInACategory(1, em);
        System.out.println("le nombre des coureurs : "+ coureurs.size());
        for (E_Coureur coureur: coureurs) {
            System.out.println(coureur);
        }

       List<E_Commentaire> comments = JPQLUtils.getCommentaireByHashtag("ultramarathon", em);
        System.out.println("On affiche maintenant tous les commentaires avec le hashtag 'ultramarathon");
        System.out.println("le nombre des commentaires : "+ comments.size());
        for (E_Commentaire comment : comments) {
            System.out.println("commentaire : "+ comment.getText());
        }



        em.close();



    }
}
