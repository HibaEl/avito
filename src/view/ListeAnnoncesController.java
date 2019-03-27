/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AnnonceColocation;
import helper.AnnonceHelper;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javax.swing.JOptionPane;
import service.AnnonceColocationService;

/**
 * FXML Controller class
 *
 * @author Elitebook folio
 */
public class ListeAnnoncesController implements Initializable {
    
    @FXML
    private TableView tableView;
    @FXML
    AnnonceColocationService annonceColocationService= new AnnonceColocationService();
    @FXML
    private AnnonceHelper annonceHelper;
    @FXML
    private AnnonceColocation annonceColocation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   initHelper();
    }    
    
    public void initHelper(){
        annonceHelper = new AnnonceHelper(tableView,annonceColocationService.findAll());  
    }

    public void delete(ActionEvent actionEvent) throws IOException{
        AnnonceColocation annonce=(AnnonceColocation) tableView.getSelectionModel().getSelectedItem();
        annonceColocationService.deleteAnnonce(annonce);
        tableView.refresh();
        JOptionPane.showMessageDialog(null, "annonce supprimée", null, JOptionPane.INFORMATION_MESSAGE);
        Launcher.forward(actionEvent, "Home.fxml", this.getClass());
    }
    
    public TableView getTableView() {
        return tableView;
    }

    public void setTableView(TableView tableView) {
        this.tableView = tableView;
    }

    public AnnonceColocationService getAnnonceColocationService() {
        return annonceColocationService;
    }

    public void setAnnonceColocationService(AnnonceColocationService annonceColocationService) {
        this.annonceColocationService = annonceColocationService;
    }

    public AnnonceHelper getAnnonceHelper() {
        return annonceHelper;
    }

    public void setAnnonceHelper(AnnonceHelper annonceHelper) {
        this.annonceHelper = annonceHelper;
    }
    
    
}
