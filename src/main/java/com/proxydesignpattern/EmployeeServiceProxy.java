package com.proxydesignpattern;

public class EmployeeServiceProxy implements EmployeeService{
    private EmployeeService employeeService;

    public EmployeeServiceProxy(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void create(String user, Employee employee) {
        if ("Admin".equals(user)) {
            this.employeeService.create(user, employee);
        } else {
            System.out.println("Unauthorized");
        }
    }

    @Override
    public void delete(String user, Employee employee) {
        if ("Admin".equals(user)) {
            this.employeeService.delete(user, employee);
        } else {
            System.out.println("Unauthorized");
        }
    }

    @Override
    public void update(String user, Employee employee) {
        if ("Admin".equals(user)) {
            this.employeeService.update(user, employee);
        } else {
            System.out.println("Unauthorized");
        }
    }
}
