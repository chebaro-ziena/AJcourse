
package assignment2labaj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class Assignment2LabAJ extends Application {
    static boolean valid = true;
    @Override
    public void start(Stage primaryStage) {
        
        Label lb1 =new Label("Name : ");
        lb1.setTextFill(Color.DARKVIOLET);
        lb1.setFont(Font.font("times new roman", 15));
        Label lb2 =new Label("Email : ");
        lb2.setTextFill(Color.DARKVIOLET);
        lb2.setFont(Font.font("times new roman", 15));
        Label lb3 =new Label("Phone : ");
        lb3.setTextFill(Color.DARKVIOLET);
        lb3.setFont(Font.font("times new roman", 15));
        Label lb4 =new Label("Password : ");
        lb4.setTextFill(Color.DARKVIOLET);
        lb4.setFont(Font.font("times new roman", 15));
        Label lb5 =new Label("Confirm : ");
        lb5.setTextFill(Color.DARKVIOLET);
        lb5.setFont(Font.font("times new roman", 15));
        Label lb6 =new Label("Country : ");
        lb6.setTextFill(Color.DARKVIOLET);
        lb6.setFont(Font.font("times new roman", 15));
        Label lb7 =new Label("Gender : ");
        lb7.setTextFill(Color.DARKVIOLET);
        lb7.setFont(Font.font("times new roman", 15));
        Label lb8 =new Label("Language : ");
        lb8.setTextFill(Color.DARKVIOLET);
        lb8.setFont(Font.font("times new roman", 15));
        Label lb9 =new Label("About you : ");
        lb9.setTextFill(Color.DARKVIOLET);
        lb9.setFont(Font.font("times new roman", 15));
        TextField t1=new TextField();
        t1.setPromptText("ahmad");
        t1.setMaxWidth(220);
        TextField t2=new TextField();
        t2.setPromptText("mutaz");
        TextField t3=new TextField();
        t3.setPromptText("1234h");
        PasswordField t4=new PasswordField();
        t4.setPromptText("123");
        PasswordField t5=new PasswordField();
        TextField t6=new TextField();
        t6.setPromptText("Your Biography...\n\n\n\n");
        t6.setMinWidth(220);
        t6.setMaxHeight(200);
        RadioButton b1 = new RadioButton("Male");
        RadioButton b2 = new RadioButton("Female");
        final ToggleGroup group = new ToggleGroup();
        b1.setToggleGroup(group);
        b2.setToggleGroup(group);
        HBox hb1 = new HBox(10);
        hb1.getChildren().addAll(b1,b2);
        ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("Lebanon","Jordan","Egypt","Palestine");
        cb.getSelectionModel().select(null);
        CheckBox t = new CheckBox("Arabic");
        CheckBox tt = new CheckBox("English");
        CheckBox ttt = new CheckBox("Spanish");
        HBox hb2 = new HBox(10);
        hb2.getChildren().addAll(t,tt,ttt);
        Button b=new Button("Register");
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("registration");
        ButtonType type = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        Alert alert1 = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("registration");
        ButtonType type1 = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);

        alert.setContentText("Successfully Registered");
        alert1.setContentText("not Registered , please try again");
        final Text actiontarget = new Text();
        actiontarget.setFill(Color.FIREBRICK);
       
        t1.setOnKeyTyped(e->{        
        if(validateLetters(t1.getText())==false) {
        actiontarget.setText("Name must not have digits !");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        
        });

        t3.setOnKeyTyped(e->{if(t3.getText().length()!=8){
        actiontarget.setText("phone number must be 8 digits length !");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        
        
        });
       
        t2.setOnKeyTyped(e->{if(isValidEmail(t2.getText())==false){   
        actiontarget.setText("Invalid Email !");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        });
        
        t4.setOnKeyTyped(e->{if(isValidpassword(t4.getText())==false) {     
        actiontarget.setText(" Invalid password ,Password: Contains at least one capital letter, one small letter");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        });
        
        t5.setOnKeyTyped(e->{if (!(t4.getText().matches(t5.getText())))    
        { actiontarget.setText("Your password do not match !");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        });
        
        cb.setOnKeyTyped(e->{if(cb.getSelectionModel().equals(null))
        { actiontarget.setText("Country: must be selected !");
        valid=false;}
       
        });
        
        
        
        t6.setOnKeyTyped(e->{if(t6.getText().length()>50)
        {actiontarget.setText("not enough info about you !");
        valid=false;}
        else {
        actiontarget.setText("");
        valid=true;}
        });
        
         b.setOnAction(e->{
             
        if(valid==true)
 
             alert.showAndWait();

        else
            alert1.showAndWait();
        });
        b.setPrefWidth(300);
        b.setAlignment(Pos.CENTER);
     
        GridPane gp=new GridPane();
        gp.setPadding(new Insets(10,25,10,25));
        gp.add(lb1, 0, 0);
        gp.add(t1, 1, 0);
        gp.add(lb2, 0, 1);
        gp.add(t2, 1, 1);
        gp.add(lb3, 0, 2);
        gp.add(t3, 1, 2);
        gp.add(lb4,0 , 3);
        gp.add(t4, 1, 3);
        gp.add(lb5, 0, 4);
        gp.add(t5, 1, 4);
        gp.add(lb6, 0, 5);
        gp.add(cb, 1, 5);
        gp.add(lb7, 0, 6);
        gp.add(hb1, 1, 6);
        gp.add(lb8, 0, 7);
        gp.add(hb2, 1, 7);
        gp.add(lb9, 0, 8);
        gp.add(t6, 1, 8);
        //gp.add(b, 0, 9);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
      
        VBox v =new VBox(10);
        VBox.setMargin(b, new Insets(0,0,0,100));

        v.getChildren().add(b);
        BorderPane p = new BorderPane();
        p.setTop(gp);
        p.setCenter(v);
        p.setBottom(actiontarget);
        actiontarget.setTextAlignment(TextAlignment.CENTER);
        p.setMargin(actiontarget, new Insets(0,0,100,150));
        p.setStyle("-fx-background-color:PINK");
        Scene scene = new Scene(p, 500, 500);
        
        primaryStage.setTitle("registration form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static boolean validateLetters(String txt) {

    String regx = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
    return matcher.find();

}
     public static boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
    return matcher.find();
   }
      public static boolean isValidpassword(String txt) {
       String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(txt);
    return matcher.find();
   }


      
    public static void main(String[] args) {
        launch(args);
    }
    
}
