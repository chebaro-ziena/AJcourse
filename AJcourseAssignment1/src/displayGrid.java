

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
/**
 *
 * @author DELL
 */
public class displayGrid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Pane gp = new Pane();
        gp.setPadding(new Insets(10));
        Line a = new Line(70,10,70,10);
        a.setStroke(Color.RED);
        a.setStrokeWidth(2);
        a.startXProperty().bind(gp.widthProperty().divide(3));
        a.startYProperty().set(0);
        a.endXProperty().bind(gp.widthProperty().divide(3));
        a.endYProperty().bind(gp.heightProperty());
        Line b = new Line(140,10,140,10);
        b.setStroke(Color.RED);
        b.setStrokeWidth(2);
        b.startXProperty().bind(gp.widthProperty().multiply(2).divide(3));
        b.startYProperty().set(0);
        b.endXProperty().bind(gp.widthProperty().multiply(2).divide(3));
        b.endYProperty().bind(gp.heightProperty());
        Line c = new Line(10,70,10,70);
        c.setStroke(Color.BLUE);
        c.setStrokeWidth(2);
        c.startXProperty().set(0);
        c.startYProperty().bind(gp.heightProperty().divide(3));
        c.endXProperty().bind(gp.widthProperty());
        c.endYProperty().bind(gp.heightProperty().divide(3));
        Line d = new Line(10,140,10,140);
        d.setStroke(Color.BLUE);
        d.setStrokeWidth(2);
        d.startXProperty().set(0);
        d.startYProperty().bind(gp.heightProperty().multiply(2).divide(3));
        d.endXProperty().bind(gp.widthProperty());
        d.endYProperty().bind(gp.heightProperty().multiply(2).divide(3));
        

        
       
      gp.getChildren().addAll(a,b,c,d);
        
        
        
        Scene scene = new Scene(gp,200,200);
        
        primaryStage.setTitle("Display a 3*3 grid ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
