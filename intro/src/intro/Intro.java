
package intro;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
​
/**
 *
 * @author DELL
 */
public class Intro extends Application {
    
    @Override
    public void start(Stage primaryStage) {
               Label b1 =new Label("welcome to java fx");
               b1.setTextFill(Color.RED);
               Label b2 =new Label("circle",new Circle(50,50,25));
               b2.setContentDisplay(ContentDisplay.TOP);
               b2.setTextFill(Color.ORANGE);
               Label b3=new Label("rectangle",new Rectangle(10,10,50,25));
               b3.setContentDisplay(ContentDisplay.RIGHT);
                Label b4=new Label("ellipse",new Ellipse(50,50,50,25));        
                       b4.setContentDisplay(ContentDisplay.LEFT);
                       StackPane sp=new StackPane();
        
                       sp.getChildren().addAll(b4,new Label("java fx"));
                       HBox hb =new HBox(20);
                       hb.getChildren().addAll(b1,b2,b3,sp);
                       Scene scene =new Scene(hb,450,150);
                 primaryStage.setTitle("hi");
                 primaryStage.setScene(scene);
                 primaryStage.show();
        {
            
           
        }
     
        
        
        
      
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
