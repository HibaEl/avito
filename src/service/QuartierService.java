/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Quartier;
import bean.Ville;
import java.util.List;

/**
 *
 * @author Elitebook folio
 */
public class QuartierService extends AbstractFacade<Quartier> {

    public QuartierService() {
        super(Quartier.class);
    }

    public List<Quartier> findQuartierbyVille(Ville ville) {
        return getMultipleResult("SELECT q FROM Quartier q where q.ville.id='" + ville.getId() + "'");

    }
}
