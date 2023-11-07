package com.proxydesignpattern;

public interface EmployeeService {
    void create(String user, Employee employee);
    void delete(String user, Employee employee);
    void update(String user, Employee employee);
}
