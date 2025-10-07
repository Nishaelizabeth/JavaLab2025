import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ButtonCounter extends Application{
	private int count=0;
	
 	@Override
	public void start(Stage stage){
	Button btn = new Button("Click Here");
	Label lb = new Label("clicks: 0");

	btn.setOnAction(e -> {
	count++;
	lb.setText("Clicks:" + count);
	});

	VBox root = new VBox(btn,lb);

	stage.setScene(new Scene(root,200,400));
	stage.setTitle("Button Counter");
	stage.show();
	}
    public static void main(String[] args){
	launch(args); }
}