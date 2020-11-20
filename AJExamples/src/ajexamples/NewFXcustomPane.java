
package ajexamples;
import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;


/**
 *
 * @author DELL
 */
public class NewFXcustomPane extends StackPane {

    public NewFXcustomPane(String title) {
        Labele t=new Labele(title);
        Label s=new Label("hi");
        getChildren().add(new Labele("hi"));
        
        setStyle("-fx-Border-Color:red");
        setPadding(new Insets(10));
    }
   
     
}
 

     

