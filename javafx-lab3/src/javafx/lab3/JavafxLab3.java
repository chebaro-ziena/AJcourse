
package javafx.lab3;

import java.awt.PageAttributes;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class JavafxLab3 extends Application {
    private static final String imageURL="https://images.search.yahoo.com/search/images?p=heart&fr=mcafee&imgurl=http%3A%2F%2Fcdn.shopify.com%2Fs%2Ffiles%2F1%2F1720%2F3475%2Fproducts%2Fcuteheart_1200x1200.jpg%3Fv%3D1541712697#id=5&iurl=http%3A%2F%2Fcdn.shopify.com%2Fs%2Ffiles%2F1%2F1720%2F3475%2Fproducts%2Fcuteheart_1200x1200.jpg%3Fv%3D1541712697&action=click";
    @Override
    public void start(Stage primaryStage) {
      Text t=creatText();
      
      primaryStage.setTitle("my third lab");
      //Pane p=new Pane();
     // p.setPadding(new Insets(5));
    //  p.setBackground(Background.EMPTY);
   //   p.getChildren().add(creatText());
      
      
      primaryStage.show();
     // p.getChildren().add(createImageView());
        VBox vb=new VBox(10);
        vb.setStyle("-fx-bachground-color:red");
        vb.getChildren().addAll(creatText(),createImageView());
        vb.setPadding(new Insets(30));
        vb.setAlignment(Pos.CENTER);
      Scene s=new Scene(vb, 400,400);
      primaryStage.setScene(s);
    
        
        
       
       
            }

    ImageView createImageView() {
        Image im=new Image(imageURL);
        ImageView i=new ImageView(imageURL);
        return i;
    }

    private Text creatText() {
        Text t=new Text("programming is soo fun !");
        t.setUnderline(true);
        t.setFill(Color.RED);
        t.setTextAlignment(TextAlignment.CENTER);

        return t;
    }
        
        
   

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
