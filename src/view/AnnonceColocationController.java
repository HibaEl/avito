/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import service.AnnonceColocationService;

/**
 * FXML Controller class
 *
 * @author Elitebook folio
 */
public class AnnonceColocationController implements Initializable {

    /**
     * Initializes the controller class.
     */
   @FXML
   private TextField id;
   @FXML
   private TextField titre;
   @FXML
   private TextArea texte;
   @FXML
   private TextField prix;
   @FXML
   private TextField ville;
   @FXML
   private TextField quartier;
   @FXML
    AnnonceColocationService annonceColocationService = new AnnonceColocationService();
   
   public void addAd(ActionEvent actionEvent) throws IOException{
        annonceColocationService.createAd(id.getText(), titre.getText(), texte.getText(), new Double(prix.getText()), ville.getText(), quartier.getText());
         Launcher.forward(actionEvent, "Home.fxml", this.getClass());
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public TextField getId() {
        return id;
    }

    public void setId(TextField id) {
        this.id = id;
    }

    public TextField getTitre() {
        return titre;
    }

    public void setTitre(TextField titre) {
        this.titre = titre;
    }

    public TextArea getTexte() {
        return texte;
    }

    public void setTexte(TextArea texte) {
        this.texte = texte;
    }

    public TextField getPrix() {
        return prix;
    }

    public void setPrix(TextField prix) {
        this.prix = prix;
    }

    public TextField getVille() {
        return ville;
    }

    public void setVille(TextField ville) {
        this.ville = ville;
    }

    public TextField getQuartier() {
        return quartier;
    }

    public void setQuartier(TextField quartier) {
        this.quartier = quartier;
    }
    
    
}
