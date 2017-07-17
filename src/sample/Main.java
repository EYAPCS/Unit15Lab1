//package sample;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Label result = new Label();
    TextField oneField = new TextField();
    TextField twoField = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane rootNode = new GridPane();
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setPadding(new Insets(30));

//        rootNode.getChildren().add(0,0, new Label("Hi"));

        rootNode.add(new Label("1: "), 0,2);
        rootNode.add(oneField, 1,2);

        rootNode.add(new Label("2: "), 0,3);
        rootNode.add(twoField, 1,3);


        Button calculate = new Button("Calculate");
        rootNode.setHalignment(calculate, HPos.RIGHT);
        rootNode.add(calculate, 1, 5);

        rootNode.add(result, 1, 6);


//        Scene scene = new Scene(rootNode, 240, 100);
        primaryStage.setScene(new Scene(rootNode, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    public class CalculateHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            float oneFloat = Float.parseFloat(oneField.getText());
            float twoFloat = Float.parseFloat(twoField.getText());

            float resultFloat = oneFloat + twoFloat;

            result.setText(Float.toString(resultFloat));

        }

    }

}