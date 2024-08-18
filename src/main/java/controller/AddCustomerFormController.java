package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCustomerFormController implements Initializable {

    @FXML
    private JFXComboBox<String> cmbtitle;

    @FXML
    private JFXTextField txtaddress;

    @FXML
    private JFXTextField txtdob;

    @FXML
    private JFXTextField txtid;

    @FXML
    private JFXTextField txtname;

    @FXML
    private JFXTextField txtno;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String id = txtid.getText();
        String name = txtname.getText();
        String address = txtaddress.getText();
        String cnum = txtno.getText();
        String dob = txtdob.getText();
        String title = cmbtitle.getValue();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> titles=FXCollections.observableArrayList();
        titles.add("MR");
        titles.add("Miss");
        cmbtitle.setItems(titles);

    }
}
