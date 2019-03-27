/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AnnonceColocation;

import bean.User;
import bean.Ville;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Elitebook folio
 */
public class AnnonceColocationService extends AbstractFacade<AnnonceColocation> {

    public AnnonceColocationService() {
        super(AnnonceColocation.class);
    }

    public List<AnnonceColocation> findByCreteria(String id, String ville,String quartier) {
        String query = constructQuery(id, ville,quartier);
        return getEntityManager().createQuery(query).getResultList();
    }

    private String constructQuery(String id, String ville, String quartier) {
        String query = "SELECT a FROM AnnonceCollocation a WHERE 1=1";
        if (id != null) {
            query += " AND a.id='" + id + "'";
            return query;
        }
        if (ville != null ) {
            query += " AND a.ville='" + ville + "'";
        }
        if (quartier != null) {
            query += " AND a.quartier'" + quartier+ "'";
        }  
        return query;
    }
    
    public int createAd(String id,String titre,String texte,double prix,String ville,String quartier){
        AnnonceColocation annonceColocation = new AnnonceColocation();
        if(annonceColocation != null){
        annonceColocation.setId(id);
        annonceColocation.setTitre(titre);
        annonceColocation.setTexte(texte);
        annonceColocation.setPrix(prix);
        annonceColocation.setDateAnnonce(new Date());
        annonceColocation.setVille(ville);
        annonceColocation.setQuartier(quartier);
        create(annonceColocation);
        return 1;
    } 
        else return -1;
    }
    
    
   public int deleteAnnonce(AnnonceColocation annonceColocation){
       remove(annonceColocation);
       return 1;
   }
  
}
