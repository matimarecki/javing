package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
public class Controller {
    @FXML
    Button VampLords;

    @FXML
    DatePicker Troll;



    public void gitgud () {
        System.out.println("Haste+Prayer+AnimateDead");
    }

    public void tell_me() {
        System.out.println(Troll.getValue());
    }
}
