
package ajlabassignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class login extends Application {
/**
 *
 * @author DELL
 */
    GridPane gp= new GridPane();
  public Scene scene1 = new Scene(gp, 400, 250);
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Path path = Paths.get("C:\\zeina\\users.txt"); 
        File file = new File(path.toString());
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("log In");
        Scanner filescan= new Scanner(file);
        TextField tf= new TextField();
        PasswordField pf=new PasswordField();
        Button b=new Button("Sign in");
        b.setAlignment(Pos.BOTTOM_RIGHT);
        b.setTextFill(Color.WHITE);
        String imageURL="https://picsum.photos/200";
        b.setOnAction(e->{
        filescan.nextLine();//to skip the 2 first lines that contains "User password"
        filescan.nextLine();
            while(filescan.hasNext()){
                
               if(filescan.next().equals(tf.getText())){
             
                   if(filescan.next().equals(pf.getText())){
                    alert.setContentText("successfully loged in !");
                    alert.show();
                   }else { alert.setContentText("Password is incorrect !");
                   alert.show();}
                   
               }else{filescan.nextLine();}
            } alert.setContentText("Username does not exist !");
            alert.show();
            filescan.close();
            
        
        });
        
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        gp.setStyle("-fx-background-Color:CORNSILK");
        gp.add(userName(), 0, 1);
        gp.add(tf, 1, 1);
        gp.add(Password(), 0, 2);
        gp.add(pf, 1, 2);
        gp.add(b, 1, 3);
        gp.add(createImageFromURL(imageURL), 0, 0);
        
        
        
        
        
        
       
        
       
        
        primaryStage.setTitle("login for an account !");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Label userName() {
        Label userName = new Label("User Name :");

        userName.setAlignment(Pos.CENTER);
        userName.setFont(Font.font(20));
        userName.setStyle(STYLESHEET_CASPIAN);
        userName.setPadding(Insets.EMPTY);
        userName.setTextFill(Color.LIGHTSALMON);
        return userName;
    }
    private Label Password(){
    
        Label pw = new Label("Password");
        pw.setAlignment(Pos.CENTER);
        pw.setFont(Font.font(20));
        pw.setStyle(STYLESHEET_CASPIAN);
        pw.setPadding(Insets.EMPTY);
        pw.setTextFill(Color.LIGHTSALMON);
        return pw;
    
    
    
    }

    
    private ImageView createImageFromURL(String imageURL){
        
        Image image = new Image(imageURL, 300, 200, true, true);
        ImageView imageView = new ImageView(image);
         imageView.setX(50);
        imageView.setY(50);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        return imageView;}
    
    
    public static void main(String[] args) {
        launch(args);
    }
    public Scene getscene(){
    return  scene1;
    }
}

    

