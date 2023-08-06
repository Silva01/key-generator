package br.net.silva.daniel.generator.password.key.keypasswordgenerator.infrastructure.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GeneratorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}