/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Rashid Iqbal
 */
public class AppController implements Initializable {
    
    double x = 0, y = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void dragged(MouseEvent event) {
        
        Node node = (Node) event.getSource();
        
        Stage stage = (Stage) node.getScene().getWindow();
        
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }
    
    @FXML
    private void pressed(MouseEvent event) {
        
        x = event.getSceneX();
        y = event.getSceneY();
    }
    
}
