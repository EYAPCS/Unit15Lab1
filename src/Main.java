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

/**
 * Uses JavaFX to create a simple sum calculator
 */

public class Main extends Application {

    TextField result = new TextField();
    TextField oneField = new TextField();
    TextField twoField = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Simple Calculator");

        GridPane rootNode = new GridPane();
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setPadding(new Insets(30));

        rootNode.add(new Label("First Value: "), 0,2);
        rootNode.add(oneField, 1,2);

        rootNode.add(new Label("Second Value: "), 0,3);
        rootNode.add(twoField, 1,3);


        Button calculate = new Button("Calculate");
        rootNode.setHalignment(calculate, HPos.RIGHT);
        rootNode.add(calculate, 1, 6);

        CalculateHandler calculateHandler = new CalculateHandler();
        calculate.setOnAction(calculateHandler);

        rootNode.add(new Label("Sum: "), 0,5);
        rootNode.add(result, 1,5);

        primaryStage.setScene(new Scene(rootNode, 350, 200));
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