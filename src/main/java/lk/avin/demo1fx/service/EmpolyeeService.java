package lk.avin.demo1fx.service;

import lk.avin.demo1fx.dto.EmployeeDto;
import lk.avin.demo1fx.entity.Employee;

import java.util.ArrayList;

public interface EmpolyeeService {

    boolean saveEmploye(EmployeeDto employeeDto);
    boolean updateEmployee(EmployeeDto employeeDto);
    boolean deleteEmployee(int idNo);
    ArrayList<EmployeeDto> getAllEmployee();

}
