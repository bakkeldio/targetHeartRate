package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Controller {



        @FXML
        private TextField inputAge;

        @FXML
        private Button calculateButton;

        @FXML
        private TextField maxRate;

        @FXML
        private TextField targetHeartRange;

        @FXML
        void calculateButtonPressed(ActionEvent event) {

                Integer age = Integer.parseInt(inputAge.getText());
                int max = 220 - age;
                Double range = 0.6;
                Double targetRange = max*range;
                setResult(targetRange, max);

            }
            void setResult(Double targetRange, Integer max){
                targetHeartRange.setText(targetRange.toString());
                maxRate.setText(max.toString());


        }

    }

