package br.net.silva.daniel.generator.password.key.keypasswordgenerator.infrastructure.controller;

import br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.domain.KeyGenerator;
import br.net.silva.daniel.generator.password.key.keypasswordgenerator.domain.password.interfaces.AbstractKeyGenerator;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class GeneratorController {
    @FXML
    private TextField welcomeText;

    @FXML
    private CheckBox uppercaseCheckBox;

    @FXML
    private CheckBox lowercaseCheckBox;

    @FXML
    private CheckBox numbersCheckBox;

    @FXML
    private CheckBox specialCharactersCheckBox;

    @FXML
    private Slider passwordLengthSlider;

    @FXML
    private Label sliderLabel;

    @FXML
    protected void onHelloButtonClick() {
        AbstractKeyGenerator keyGenerator = new KeyGenerator(
                uppercaseCheckBox.isSelected(),
                lowercaseCheckBox.isSelected(),
                numbersCheckBox.isSelected(),
                (int) passwordLengthSlider.getValue(),
                specialCharactersCheckBox.isSelected());

        welcomeText.setText(keyGenerator.process());
    }

    public void onSlideChange() {
        sliderLabel.setText(String.valueOf((int) passwordLengthSlider.getValue()));
    }
}