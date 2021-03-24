package com.controllers;

import com.models.Employee;
import com.services.EmployeeService;

import java.util.Scanner;

public class EmployeeCRUDController {

    private static Scanner scanner = new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeService();

    public String dispAllEmployees(){
       return employeeService.getEmployees();
    }

    public int addEmployee() {

        try {
            System.out.println("Inside Add Method **********");
            System.out.println("Enter Employee Name");
            String empName = scanner.nextLine();
            Employee emp = new Employee();
            emp.setEmpName(empName);
            return employeeService.addEmployee(emp);
        }
        catch (Exception ex){
            System.out.println("Add method could not be completed");
            ex.printStackTrace();
        }
        return 0;
    }

    public void handleRequest(){
        Boolean flag = true;
        while (flag) {
            System.out.println("Select an Option 1.ADD 2.List 99.Terminate");
            String rawInput = scanner.nextLine();
            System.out.println("You entered the Input  " + rawInput);
            int intInput = Integer.MIN_VALUE;
            try {
                intInput = Integer.parseInt(rawInput);
                switch (intInput){
                    case 1:
                        int id = addEmployee();
                        System.out.println("Added Employee Generated ID: " +id);
                        break;
                    case 2:
                        System.out.println(dispAllEmployees());
                        break;
                    case 99:
                        flag = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception exp) {
                System.out.println("You have Entered an Invalid Input. To go Back Enter 1 ; else Enter to terminate");
                rawInput = scanner.nextLine();
                try {
                    intInput = Integer.parseInt(rawInput);
                } catch (Exception ex) {
                    flag = false;
                }
                switch (intInput){
                    case 1:
                        flag = true;
                        break;
                    default:
                        flag = false;
                        break;
                }
            }

        }
        scanner.close();
    }


}
