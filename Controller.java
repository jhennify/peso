package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtResu;

    @FXML
    private Button btSomar;

    @FXML
    private TextField txtPreco;
    @FXML
    private RadioButton rbPrazo;

    @FXML
    private RadioButton rbVista;


    @FXML
    void somar(ActionEvent event) {
        double preco = Double.parseDouble(txtPreco.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        double resultado = peso*preco;
        if(rbVista.isSelected()){
            double desconto = resultado - (resultado* 0.05);
            txtResu.setText(String.valueOf(desconto));

        }
        else if(rbPrazo.isSelected()){
            double aumento = resultado + (resultado * 0.05);
            txtResu.setText(String.valueOf(aumento));

        }



    }
    @FXML
    void Vista(ActionEvent event) {

            rbPrazo.setSelected(false);





    }

    @FXML
    void prazo(ActionEvent event) {

            rbVista.setSelected(false);

    }

    @FXML
    void initialize() {


    }
}

