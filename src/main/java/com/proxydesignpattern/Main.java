package com.proxydesignpattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sample");
        EmployeeService employeeService = new EmployeeServiceProxy(new EmployeeServiceImpl());
        employeeService.create("Admin", employee);
        employeeService.create("User", employee);
    }
}
