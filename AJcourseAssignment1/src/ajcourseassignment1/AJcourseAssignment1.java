
package ajcourseassignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class AJcourseAssignment1 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        gp.add( creatImageview0(),0, (int)Math.random()*2);
        gp.add( creatImageview1(),(int)Math.random()*2, 0);
        gp.add( creatImageview2(),1, (int)Math.random()*2);
        gp.add( creatImageview0(),(int)Math.random()*2, 1);
        gp.add( creatImageview1(),2, (int)Math.random()*2);
        gp.add( creatImageview2(),(int)Math.random()*2, 2);
        
        
        
        
        Scene scene = new Scene(gp, 300, 250);
        
        primaryStage.setTitle("tic tac toa ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     ImageView creatImageview0() throws FileNotFoundException{
        InputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\empty.gif");
        ImageView empty= new ImageView(new Image(in));
        return empty;
    }
     ImageView creatImageview1() throws FileNotFoundException{
        InputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\o.gif");
        ImageView o= new ImageView(new Image(in));
        return o;
    }
     ImageView creatImageview2() throws FileNotFoundException{
        InputStream in = new FileInputStream("C:\\Users\\DELL\\Desktop\\x.gif");
        ImageView x= new ImageView(new Image(in));
        return x;
    }
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
