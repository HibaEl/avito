/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Elitebook folio
 */
public class HomeController implements Initializable {

     @FXML
    public void addUser(javafx.event.ActionEvent actionEvent) throws IOException {
        Launcher.forward(actionEvent, "User.fxml", this.getClass());
    }
     @FXML
    public void addAd(javafx.event.ActionEvent actionEvent) throws IOException {
        Launcher.forward(actionEvent, "AnnonceColocation.fxml", this.getClass());
    }
     @FXML
    public void login(javafx.event.ActionEvent actionEvent) throws IOException {
        Launcher.forward(actionEvent, "Connection.fxml", this.getClass());
    }
    @FXML
    public void initHelper(javafx.event.ActionEvent actionEvent) throws IOException {
        Launcher.forward(actionEvent, "ListeAnnonces.fxml", this.getClass());
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
