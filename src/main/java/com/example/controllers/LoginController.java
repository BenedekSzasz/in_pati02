package com.example.controllers;
import javafx.scene.control.Alert.AlertType;
import com.example.App;
import com.example.models.Auth;

import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void onClickLoginButton(ActionEvent event) {
        if(Auth.isValid(usernameField.getText(), passwordField.getText())) {
            App.setRoot("mainScene");
        } else{
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Hibás adatok!");
            alert.setContentText("A felhasználónév vagy a jelszó érvénytelen!");
            alert.setHeaderText("Azonosítási hiba!");
            alert.initOwner(App._stage);
            alert.show();
        }
        
    }

}
