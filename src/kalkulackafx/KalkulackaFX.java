package kalkulackafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class KalkulackaFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ScenaKalkulacka.fxml"));

        Scene scene = new Scene(root);
        stage.getIcons().add(new Image(KalkulackaFX.class.getResourceAsStream("Kalkulacka.png")));
        stage.setTitle("Kalkulačka");
        stage.setScene(scene);
        stage.setWidth(432);
        stage.setHeight(625);
        stage.setMinWidth(432);
        stage.setMinHeight(625);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
