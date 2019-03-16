/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AnnonceColocation;
import bean.Quartier;
import bean.Ville;
import java.util.List;

/**
 *
 * @author Elitebook folio
 */
public class AnnonceColocationService extends AbstractFacade<AnnonceColocation> {

    public AnnonceColocationService() {
        super(AnnonceColocation.class);
    }

    public List<AnnonceColocation> findByCreteria(String id, Ville ville, Quartier quartier) {
        String query = constructQuery(id, ville, quartier);
        return getEntityManager().createQuery(query).getResultList();
    }

    private String constructQuery(String id, Ville ville, Quartier quartier) {
        String query = "SELECT a FROM AnnonceCollocation a WHERE 1=1";
        if (id != null) {
            query += " AND a.id='" + id + "'";
            return query;
        }
        if (ville != null && ville.getId() != null) {
            query += " AND a.quartier.ville.id='" + ville.getId() + "'";
        }
        if (quartier != null && quartier.getId() != null) {
            query += " AND a.quartier.id='" + quartier.getId() + "'";
        }
        return query;

    }
}
