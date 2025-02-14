package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label total;

    @FXML
    protected void calculatePayment() {
        total.setText("total");
    }
}