package lk.avin.demo1fx.service.impl;

import lk.avin.demo1fx.db.Database;
import lk.avin.demo1fx.dto.EmployeeDto;
import lk.avin.demo1fx.entity.Employee;
import lk.avin.demo1fx.service.EmpolyeeService;

import java.util.ArrayList;

public class EmployeeSarviceImpl implements EmpolyeeService {


    @Override
    public boolean saveEmploye(EmployeeDto employeeDto) {

        Database.employees.add(new Employee(employeeDto.getId(),employeeDto.getName(),employeeDto.getAddress(),
                employeeDto.getPosition()));
        return true;


    }

    @Override
    public boolean updateEmployee(EmployeeDto employeeDto) {
        for (Employee e:Database.employees)
        {
            if (e.getId()==employeeDto.getId())
            {
                e.setName(employeeDto.getName());
                e.setAddress(employeeDto.getAddress());
                e.setPosition(employeeDto.getPosition());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int idNo) {
        for (int i=0;i<Database.employees.size();i++)
        {
            if (Database.employees.get(i).getId()==idNo)
            {
                Database.employees.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<EmployeeDto> getAllEmployee() {
        ArrayList<EmployeeDto> allEmployee=new ArrayList<>();
        for (Employee e:Database.employees)
        {
            allEmployee.add(new EmployeeDto(e.getId(),e.getName(),e.getAddress(), e.getPosition()));
        }
        return allEmployee;

    }
}
