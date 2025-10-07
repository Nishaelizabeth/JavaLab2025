import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TextTransfer extends Application{

	@Override
	public void start(Stage stage){
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	Button btn = new Button("Submit");

	btn.setOnAction(e -> tf2.setText(tf1.getText()));
	tf1.clear();

	VBox root = new VBox(tf1,btn,tf2);

	stage.setScene(new Scene(root,200,300));
	stage.setTitle("Text Transferer");
	stage.show();
	}
	public static void main(String[] args){
	launch(args);
	}


}