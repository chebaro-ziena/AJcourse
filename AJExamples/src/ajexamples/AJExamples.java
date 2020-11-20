
package ajexamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class AJExamples extends Application {
    
    @Override
    public void start(Stage primaryStage) {
   
        Circle c=new Circle();
        c.setCenterX(50);
        c.setCenterY(50);
        c.setRadius(20);
        c.setFill(Color.PINK);
        c.setStroke(Color.MAROON);
        BorderPane p=new BorderPane();
        p.setCenter(c);
        p.setBottom(new NewFXcustomPane("hello"));
        p.setTop(new NewFXcustomPane("good day"));
        p.setRight(getVBox());
        p.setStyle("-fx-background-Color:CORNSILK");

        
      
        
        Scene scene = new Scene(p, 300, 250);
        
        primaryStage.setTitle("practice for midterm");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private VBox getVBox(){
        VBox Vbox=new VBox(15);
        Vbox.setPadding(new Insets(0,0,0,15));
        Vbox.getChildren().add(new Label("weekdays"));
        Label[] weekdays ={new Label("saturday"),new Label("monday"),new Label("friday")};
        
       for(Label day:weekdays){
       
           Vbox.getChildren().add(day);
       }
           
        return Vbox;
    }
}
