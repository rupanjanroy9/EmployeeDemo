package com.training;

import com.controllers.EmployeeCRUDController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        EmployeeCRUDController empCrud = new EmployeeCRUDController();
        empCrud.handleRequest();

        int a = 5;
        Integer i = a; //autoboxing
        a = i;  // Unboxing
    }
}
