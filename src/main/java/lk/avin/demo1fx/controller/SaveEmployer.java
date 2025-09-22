package lk.avin.demo1fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.avin.demo1fx.dto.EmployeeDto;
import lk.avin.demo1fx.entity.Employee;
import lk.avin.demo1fx.service.EmpolyeeService;
import lk.avin.demo1fx.service.impl.EmployeeSarviceImpl;

import java.util.ArrayList;

import static lk.avin.demo1fx.db.Database.employees;

public class SaveEmployer {

    @FXML
    private Label labe;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPosition;

   EmpolyeeService service = new EmployeeSarviceImpl();
    @FXML
    void delete(ActionEvent event) {

        boolean isDelete=service.deleteEmployee(Integer.parseInt(txtId.getText()));
        if (isDelete)
        {
            System.out.println("Employee Deleted!");
        }

        else
        {
            System.out.println("Employee not found!!!");
        }

    }

    @FXML
    void getAll(ActionEvent event) {

        ArrayList<EmployeeDto> employees = service.getAllEmployee();

        if (employees.size()>0)
        {
            for(EmployeeDto e:employees)
            {
                System.out.println("ID : "+e.getId()+" Name : "+e.getName()+" Address : "+e.getAddress()+" Position : "+e.getPosition());
            }
        }
        else
            System.out.println("No Employees saved yet!!!");


    }

    @FXML
    void save(ActionEvent event) {

        boolean isSaved = service.saveEmploye(new EmployeeDto(Integer.parseInt(txtId.getText()),txtName.getText(),
                txtAddress.getText(),txtPosition.getText()));

        if (isSaved)
        {
            System.out.println("Employee saved...");
        }

    }

    @FXML
    void update(ActionEvent event) {

        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        String position = txtPosition.getText();

        EmpolyeeService service = new EmployeeSarviceImpl();
        boolean saved = service.saveEmploye(new EmployeeDto(id,name,address,position));

    if (saved) {
        System.out.println("Updated");
    }
    else {
        System.out.println("Not Updated");
    }

    }
}
