package demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {

    private Label label = new Label("Hello, JavaFX!");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            getChildren().add(new MenuBar() {{
                getMenus().add(new Menu("Menu") {{
                    getItems().add(new MenuItem("change content") {{
                        this.setOnAction(event -> label.setText("Changed!"));
                    }});
                }});
            }});
            getChildren().add(label);
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}