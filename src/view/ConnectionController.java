/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import service.UserService;
import util.Session;

/**
 * FXML Controller class
 *
 * @author Elitebook folio
 */
public class ConnectionController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    UserService userService = new UserService();

    @FXML
    public void addAd(javafx.event.ActionEvent actionEvent) throws IOException {
        Launcher.forward(actionEvent, "AnnonceColocation.fxml", this.getClass());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void login(ActionEvent actionEvent) throws IOException {
        User user = new User();
        user.setLogin(login.getText());
        user.setPassword(password.getText());
        int res = userService.connectUser(user);
        if (res < 0) {
            JOptionPane.showMessageDialog(null, login.getText() + " logged", "Login succeeded", JOptionPane.INFORMATION_MESSAGE);
            Session.updateAttribute(user, "connectedUser");

            Launcher.forward(actionEvent, "Home.fxml", this.getClass());
        } else {
            JOptionPane.showMessageDialog(null, "Username or password erroné!", "Login Faild", JOptionPane.ERROR_MESSAGE);

        }
    }

    public TextField getLogin() {
        return login;
    }

    public void setLogin(TextField login) {
        this.login = login;
    }

    public TextField getPassword() {
        return password;
    }

    public void setPassword(TextField password) {
        this.password = password;
    }

}
