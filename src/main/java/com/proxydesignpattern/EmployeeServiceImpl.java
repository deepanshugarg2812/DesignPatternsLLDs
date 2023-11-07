package com.proxydesignpattern;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void create(String user, Employee employee) {
        System.out.println("Request came for creation " + employee);
    }

    @Override
    public void delete(String user, Employee employee) {
        System.out.println("Request came for deletion " + employee);
    }

    @Override
    public void update(String user, Employee employee) {
        System.out.println("Request came for updation " + employee);
    }
}
