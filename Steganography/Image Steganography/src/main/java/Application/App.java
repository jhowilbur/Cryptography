package Application;

import controller.BasicDecoder;
import controller.BasicEncoder;
import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;
import view.View;

public class App extends Application {

    // see git and tube
    // https://github.com/AlmasB/FXTutorials/blob/master/src/com/almasb/steg/StegApp.java

    private Model makeModel() {
        return new Model(new BasicEncoder(), new BasicDecoder());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new View(new Controller(makeModel())));
        primaryStage.setTitle("Wilbur ~ Steganography");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
