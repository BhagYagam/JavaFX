package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewCustomerFormController implements Initializable {

    @FXML
    private TableColumn<?, ?> coladdress;

    @FXML
    private TableColumn<?, ?> colconum;

    @FXML
    private TableColumn<?, ?> coldob;

    @FXML
    private TableView<?> tbldata;

    @FXML
    private TableColumn<?, ?> colid;

    @FXML
    private TableColumn<?, ?> colname;

    @FXML
    private TableColumn<?, ?> coltitle;

    @FXML
    void btnReloadOnAction(ActionEvent event) {
        loadTable();
    }

    private void loadTable(){

        List<Customer> customerList = DBConnection.getInstance().getConnection();
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

        customerList.forEach(obj->{
            customerObservableList.add(obj);
        });

        tbldata.setItems(customerObservableList);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        colname.setCellValueFactory(new PropertyValueFactory<>("Name"));
        coladdress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colconum.setCellValueFactory(new PropertyValueFactory<>("ContactNumber"));

        loadTable();
    }
}
