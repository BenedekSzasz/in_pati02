package com.example.controllers;

import com.example.App;
import com.example.models.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserController {

    @FXML
    private TableColumn<User, String> passCol;

    @FXML
    private TextField passField;

    @FXML
    private TableColumn<User, String> roleCol;

    @FXML
    private TextField roleField;

    @FXML
    private TableColumn<User, String> userCol;

    @FXML
    private TextField userField;

    @FXML
    private TableView<User> userTable;

    @FXML
    void onClickAddButton(ActionEvent event) {

    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickDelButton(ActionEvent event) {

    }

    @FXML
    void onClickModifyButton(ActionEvent event) {

    }

    @FXML
    void onClickSaveButton(ActionEvent event) {

    }

}
