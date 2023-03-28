package com.test.dao;

import com.Entities.E_Competition;
import com.dao.DaoCompetition;
import com.dao.jpadao.JpaDaoCompetition;

public class Test2 {
    public static void main(String[] args) {
        try {

            DaoCompetition competitionManager = new JpaDaoCompetition();
            E_Competition c1 = competitionManager.find(E_Competition.class, 15);
            if (c1 != null) {
                System.out.println("Competition N° 15 : " + c1.toString());
            }
            else {
                System.out.println("La competition recherchée n'existe pas");
            }
            E_Competition c2 = competitionManager.find(17);
            if (c2 != null) {
                System.out.println("Une Autre Competition ( 17) : " + c2.toString());
                c2.setAdressePcCourse("adresse oc course");
                competitionManager.update(c2);
                System.out.println("Une Autre Competition ( 17) après le changement de l'année: " + c2.toString());
            }
            else {
                System.out.println("La competition recherchée n'existe pas");
            }

            E_Competition c3 = competitionManager.find(E_Competition.class, 7);
            if (c3 != null) {
                System.out.println("Competition c3 : " + c3.toString());
            }
            else {
                System.out.println("La competition recherchée n'existe pas");
            }
            competitionManager.close();
        }
        catch (Exception e)
        {
            System.out.println("Sortie en erreur : "+e.getMessage());
        }
    }
}

