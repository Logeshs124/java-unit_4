import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    private Stage window;
    private Scene scene1, scene2, scene3, scene4, scene5;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        // Scene 1
        Label label1 = new Label("Welcome, this is the first webpage");
        TextField t1 = new TextField();
        t1.setPromptText("Enter your name");
        t1.setMaxWidth(250);
        Button b1 = new Button("Enter");
        Label output = new Label();
        b1.setOnAction(e -> output.setText("Your Name is: " + t1.getText()));
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, t1, b1, output, button1);
        scene1 = new Scene(layout1, 400, 400);

        // Scene 2
        Label label2 = new Label("You are in the second webpage");
        Label l1 = new Label("Please enter your age");
        TextField t2 = new TextField();
        t2.setPromptText("Enter your age");
        t2.setMaxWidth(250);
        Button b2 = new Button("Enter");
        Label output1 = new Label();
        b2.setOnAction(e -> output1.setText(" and your age is: " + t2.getText()));
        Button button2 = new Button("Go to scene 3");
        button2.setOnAction(e -> window.setScene(scene3));

        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, l1, t2, b2, output1, button2);
        scene2 = new Scene(layout2, 400, 400);

        // Scene 3
        Label label3 = new Label("You are in the third webpage");
        Label l2 = new Label("Please enter your address");
        Label l3 = new Label("Enter building name/ house number");
        TextField t3 = new TextField();
        t3.setPromptText("Enter building name/ house number");
        t3.setMaxWidth(250);
        Label l4 = new Label("Enter street name");
        TextField t4 = new TextField();
        t4.setPromptText("Enter street name");
        t4.setMaxWidth(250);
        Label l5 = new Label("Enter city name");
        TextField t5 = new TextField();
        t5.setPromptText("Enter city name");
        t5.setMaxWidth(250);
        Label l6 = new Label("Enter state name");
        TextField t6 = new TextField();
        t6.setPromptText("Enter state name");
        t6.setMaxWidth(250);
        Label l7 = new Label("Enter pincode");
        TextField t7 = new TextField();
        t7.setPromptText("Enter pincode");
        t7.setMaxWidth(250);
        Button b3 = new Button("Enter");
        Label output2 = new Label();
        b3.setOnAction(e -> output2.setText("Your address is: " + t3.getText() + ", " + t4.getText() + ", " + t5.getText() + ", " + t6.getText() + ", " + t7.getText()));
        Button button3 = new Button("Go to scene 4");
        button3.setOnAction(e -> window.setScene(scene4));

        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(label3, l2, l3, t3, l4, t4, l5, t5, l6, t6, l7, t7, b3, output2, button3);
        scene3 = new Scene(layout3, 400, 600);

        // Scene 4
        Label label4 = new Label("Okkkk.. you have come all the way to the fourth webpage");
        Label l8 = new Label("Please enter your email id");
        TextField t8 = new TextField();
        t8.setPromptText("xxxxxxxx@gmail.com");
        t8.setMaxWidth(250);
        Button b4 = new Button("Enter");
        Label output3 = new Label();
        b4.setOnAction(e -> output3.setText("Your email id is: " + t8.getText()));
        Button button4 = new Button("Go to scene 5");
        button4.setOnAction(e -> window.setScene(scene5));

        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll(label4, l8, t8, b4, output3, button4);
        scene4 = new Scene(layout4, 400, 400);

        // Scene 5
        Label label5 = new Label("All your details have been saved");
        Button button5 = new Button("Go back to scene 1");
        button5.setOnAction(e -> window.setScene(scene1));

        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll(label5, button5);
        scene5 = new Scene(layout5, 400, 400);

        window.setScene(scene1);
        window.setTitle("Sample Pages");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
