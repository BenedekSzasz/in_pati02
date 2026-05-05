package com.example.controllers;
import javafx.fxml.FXML;

import com.example.App;

import javafx.event.ActionEvent;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickUsersButton(ActionEvent event) {
        App.setRoot("userScene");
    }

}
