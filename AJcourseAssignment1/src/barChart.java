

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/**
 *
 * @author DELL
 */
public class barChart extends Application {
    
    @Override
    public void start(Stage primaryStage){
      
        HBox hb = new HBox(8);
        hb.setPadding(new Insets(10));
        Rectangle project =new Rectangle(100 , 60, Color.RED);
        Rectangle quiz =new Rectangle(100 , 30, Color.BLUE);
        Rectangle midterm =new Rectangle(100, 90, Color.GREEN);
        Rectangle f =new Rectangle(100, 120, Color.GOLD);
        hb.setAlignment(Pos.BOTTOM_CENTER);
        Label b = new Label("Project -- 20% ", project);
        b.setAlignment(Pos.TOP_LEFT);
        b.setContentDisplay(ContentDisplay.BOTTOM);
        Label a = new Label("Quiz -- 10%",quiz);
        a.setAlignment(Pos.TOP_LEFT);
        a.setContentDisplay(ContentDisplay.BOTTOM);
        Label c = new Label("Midterm -- 30%",midterm);
        c.setAlignment(Pos.TOP_LEFT);
        c.setContentDisplay(ContentDisplay.BOTTOM);
        Label d = new Label("Final -- 40%",f);
        d.setAlignment(Pos.TOP_LEFT);
        d.setContentDisplay(ContentDisplay.BOTTOM);
        hb.getChildren().addAll(b,a,c,d);
        
        
        Scene scene = new Scene(hb,500, 500);
        
        primaryStage.setTitle("Display a bar chart");
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
