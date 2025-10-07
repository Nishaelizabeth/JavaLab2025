import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class Password extends Application{

	@Override

	public void start(Stage stage){
	PasswordField pf = new PasswordField();
	Label lb = new Label();
	Button btn = new Button("Enter");

	btn.setOnAction(e -> lb.setText("Password Entered!"));


 	VBox root = new VBox(10,pf,btn,lb);
      
        stage.setScene(new Scene(root,200,300));
  	stage.setTitle("Enter Password");
	stage.show();
        }
    public static void main(String[] args){
	launch(args);
	
	}
}