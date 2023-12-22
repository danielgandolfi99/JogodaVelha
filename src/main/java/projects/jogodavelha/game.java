package projects.jogodavelha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class game extends Application {

    // Inicializando a interface e setando o título para a mesma
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(game.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Jogo da Velha");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
