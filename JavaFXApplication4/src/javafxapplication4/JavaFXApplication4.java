
package javafxapplication4;

import com.sun.prism.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class JavaFXApplication4 extends Application {
    protected Text t =new Text("javafx programming"); 
    protected BorderPane getPane(){
    HBox b =new HBox(20);
    Button bleft =new Button("left",new ImageView(" file:///C:/Users/DELL/Desktop/254094.svg"));
    Button bright=new Button("right",new ImageView("file:///C:/Users/DELL/Desktop/602147.svg"));
    b.getChildren().addAll(bleft,bright);
    b.setAlignment(Pos.CENTER);
    BorderPane pane =new BorderPane();
    pane.setBottom(b);
    Pane p=new Pane();
    p.getChildren().add(t);
    pane.setCenter(t);
    return pane;
    
    }
   
    public void start(Stage primaryStage) {
  
        Scene scene = new Scene(getPane(), 300, 250);
        
        primaryStage.setTitle("button");
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
