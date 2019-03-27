/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.AnnonceColocation;
import java.util.List;
import javafx.scene.control.TableView;

/**
 *
 * @author YOUNES
 */
public class AnnonceHelper extends AbstractHelper<AnnonceColocation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("titre ", "titre"),
            new AbstractHelperItem("texte", "texte"),
            new AbstractHelperItem("prix ","prix"),
            new AbstractHelperItem("ville ","ville"),
            new AbstractHelperItem("quartier ","quartier")
            
            
            
        };

    }

    public AnnonceHelper(TableView<AnnonceColocation> table , List<AnnonceColocation> list) {
        super(titres, table, list);
    }

  

    public AnnonceHelper(TableView<AnnonceColocation> table) {
        super(titres, table);
    }
}
