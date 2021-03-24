package com.services;

import com.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    /*This object will ensure that even
    does not become in consistent */
    private static int employeeIDCounter = 1;

    /**
     * This Method adds an Employee Object in the EmployeeList of Service Class
     * @param employee
     * @return EmployeeID
     */
    public int addEmployee(Employee employee){
        employee.setEmpId(employeeIDCounter++);
        employeeList.add(employee);
        return employee.getEmpId();
    }

    public String getEmployees(){
        return employeeList.toString();
    }
}
