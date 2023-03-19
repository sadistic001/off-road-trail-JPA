package com.Utils.JPA;

import com.Entities.E_Coureur;
import jakarta.persistence.*;

import java.util.List;

public class CoureurEntityController{



    public CoureurEntityController() {

    }

    public E_Coureur getCoureurbyId(int idCoureur, EntityManager em) {
        return em.find(E_Coureur.class, idCoureur);
    }

    public List<E_Coureur> getCoureurs(int idCoureur, EntityManager em) {
        Query q = em.createQuery("select t from E_Coureur t where id = " + idCoureur);
        List<E_Coureur> listeCoureurs = q.getResultList();
        if ( listeCoureurs!=null && !listeCoureurs.isEmpty()) {
            return listeCoureurs;
        }
        else return null;
    }

    public  int insertCoureur(E_Coureur coureur, EntityManager em, EntityTransaction transaction ){
        transaction.begin();
        em.persist(coureur);
        em.flush();
        int id = coureur.getId();
        transaction.commit();

        return id;
    }

    public  void updateCoureur(int id, E_Coureur toUpdate, EntityManager em, EntityTransaction transaction){
        transaction.begin();
        E_Coureur coureur = em.find(E_Coureur.class, id);
        if (toUpdate.getNom() != null)
            coureur.setNom(toUpdate.getNom());
        if (toUpdate.getPrenom() != null)
            coureur.setPrenom(toUpdate.getPrenom());
        if (toUpdate.getPassword() != null)
            coureur.setPassword(toUpdate.getPassword());
        if (toUpdate.getTelephone() != null)
            coureur.setTelephone(toUpdate.getTelephone());
        em.merge(coureur);
        transaction.commit();
    }
    public boolean coureurExists(int id, EntityManager em){
        return em.find(E_Coureur.class, id) != null;
    }

    public void deleteCoureurById(int id, EntityManager em){
        E_Coureur coureur = getCoureurbyId(id, em);
        if (coureur != null){
            em.remove(coureur);
        }
    }

    public void closeEM(EntityManager em){
        em.close();
    }

}