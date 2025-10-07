import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class GenderSelection extends Application{
	@Override
	public void start(Stage stage){
	RadioButton male = new RadioButton("male");
	RadioButton female = new RadioButton("female");
	ToggleGroup group = new ToggleGroup();
	male.setToggleGroup(Group);
	female.setToggleGroup(Group);
	Label lb = new Label();

        group.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                RadioButton selected = (RadioButton) newVal;
                label.setText("Selected: " + selected.getText());
            }
        });

	
	VBox root = new VBox(tf1,btn,tf2);

	stage.setScene(new Scene(root,200,300));
	stage.setTitle("Gender Selection");
	stage.show();
	}
	public static void main(String[] args){
	launch(args);
	}

}