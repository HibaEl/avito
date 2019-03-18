/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;

/**
 *
 * @author Elitebook folio
 */
public class UserService extends AbstractFacade<User> {

    public UserService() {
        super(User.class);
    }

    public int createUser(String id,String login, String password, String nom, String prenom, String adresse, double tel) {
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setPassword(password);
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setAdresse(adresse);
        user.setTel(tel);
        user.setNbrCnnxRestant(3);
        create(user);
        return 1;
     
    }


     public int connectUser(User user) {
        User LoadedUser = find(user.getLogin());
        if (LoadedUser == null) {
            return -1;
        } else if (!LoadedUser.getPassword().equals(user.getPassword())) {
            return -2;
        } else {
            user.setNbrCnnxRestant(user.getNbrCnnxRestant()-1);
            user.setBloque(1);
            return 1;
        }
    }

}
