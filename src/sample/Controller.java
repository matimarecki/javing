package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;


public class Controller {
    @FXML
    Button VampLords;

    @FXML
    DatePicker Troll;

    @FXML
    Canvas ccc;


    public void aaa() {
        GraphicsContext gc = ccc.getGraphicsContext2D();

        for(double q = 0.5; q<=2; q += 0.1) {
            gc.strokeOval(200,200, 100 * q, 100 * 1/q);
        }

        for (int i = 0; i < 200; i++) {
            gc.strokeLine(0,0,i * 3, 500);
        }

    }

    public void gitgud () {
        System.out.println("Haste+Prayer+AnimateDead");
    }

    public void tell_me() {
        System.out.println(Troll.getValue());
    }
}
