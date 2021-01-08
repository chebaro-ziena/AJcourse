
package ajlabassignment3;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author DELL
 */
public class AJlabassignment3 extends Application {
    static int count=0;
    @Override
    public void start(Stage primaryStage) {
       
        Label b1 = new Label("welcom to this website !");
        b1.setTextFill(javafx.scene.paint.Color.SALMON);
	b1.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 12d));
        Button b=new Button("Sign Up");
        b.setAlignment(Pos.BOTTOM_RIGHT);
        b.setTextFill(Color.WHITE);
        b.setOnAction(e->{ primaryStage.setScene(scene2);
        });
        
        Button b2=new Button("sign in");
        b2.setOnAction(e->{ primaryStage.setScene(scene1);
        });
        GridPane gp= new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.BASELINE_LEFT);
        gp.setStyle("-fx-background-Color:CORNSILK");
        gp.add(b1, 0, 0);
        gp.add(b, 0, 1);
        gp.add(b2, 0, 2);

        Timeline fortext = new Timeline(new KeyFrame(Duration.millis(500),e->{
     
         if(b1.getText().length()!=0){
             b1.setText("");}
     
         else 
             b1.setText("welcom to this website !");
     
     }));
     fortext.setCycleCount(Timeline.INDEFINITE);
     fortext.play();
    
   
                  
        ImageView[] imgView = new ImageView[4];
        ObservableList<ImageView> imges = FXCollections.observableArrayList(imgView);
       
        imgView[0] = new ImageView(new  Image("file:///C://Users//DELL//Desktop//slide9.jpg"));
        imgView[1] = new ImageView(new Image("‪file:///C://Users//DELL//Desktop//slide4.jpg"));
        imgView[2] = new ImageView(new Image("‪file:///C://Users//DELL//Desktop//slide8.jpg"));
        imgView[3] = new ImageView(new Image("file:///C://Users//DELL//Desktop//slide4 (1).jpg"));
        imgView[4] = new ImageView(new Image("file:///C://Users//DELL//Desktop//slide0.jpg"));
        
        Timeline t= new Timeline(new KeyFrame(Duration.millis(2000),e->{
        if (count < 4) {
                // Adding Children
               gp.getChildren().remove(imgView[count]);
                count++;
                gp.getChildren().add(imgView[count]);}
          else if (count== 4) {
                count= 0;
                gp.getChildren().remove(imgView[4]);
                gp.getChildren().add(imgView[count]);
          }}));
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
          gp.getChildren().add(imgView[count]);
         
         BackgroundImage bgImg = new BackgroundImage(imges, 
                 BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                 BackgroundPosition.DEFAULT, 
    new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));

         gp.setOnMouseClicked(e -> {
            if (t.getStatus() ==  Animation.Status.PAUSED) {
                t.play();
            } else 
                t.pause();
    });
        
        
        
        
        
       
        
        Scene mainscene = new Scene(gp, 300, 300);
        
        primaryStage.setTitle("login for an account !");
        primaryStage.setScene(mainscene);
        primaryStage.show();
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
