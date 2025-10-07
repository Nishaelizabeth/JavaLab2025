import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
 
public class TextDisplayClear extends Application{
	
	@Override
	public void start(Stage stage){
	TextField tf = new TextField();
	Label lb = new Label();
	Button showbtn = new Button("Show");
	Button clearBtn = new Button("Clear");

	showbtn.setOnAction(e -> lb.setText(tf.getText()));
	clearBtn.setOnAction(e -> {
		tf.clear();
		lb.setText(" ");
	});
	
	VBox root = new VBox(10,tf,lb,showbtn,clearBtn);
	stage.setScene(new Scene(root,300,400));
	stage.setTitle("Text Display and Clear");
	stage.show();
	}
  public static void main(String[] args){
	launch(args);
	}
}


