module br.net.silva.daniel.generator.password.key.keypasswordgenerator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    exports br.net.silva.daniel.generator.password.key.keypasswordgenerator.infrastructure.controller;
    opens br.net.silva.daniel.generator.password.key.keypasswordgenerator.infrastructure.controller to javafx.fxml;
    exports br.net.silva.daniel.generator.password.key.keypasswordgenerator;
    opens br.net.silva.daniel.generator.password.key.keypasswordgenerator to javafx.fxml;
}