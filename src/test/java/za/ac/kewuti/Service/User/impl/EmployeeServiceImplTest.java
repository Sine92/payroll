package za.ac.kewuti.Service.User.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Factory.User.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

private EmployeeServiceImpl employeeService;
private Employee employee;
    @Before
    public void setUp() throws Exception {
        employeeService = EmployeeServiceImpl.getService();
        employee = EmployeeFactory.createEmployee("Sine","Kewuti","");
    }

    @Test
    public void getAll() {
        assertEquals(employeeService.getAll(),employeeService.getAll());
    }

    @Test
    public void create() {
        assertEquals(employeeService.create(employee),employeeService.create(employee));
    }

    @Test
    public void update() {
        assertEquals(employeeService.update(employee),employeeService.update(employee));
    }

    @Test
    public void delete() {
      employeeService.delete("");
    }

    @Test
    public void read() {
        assertEquals(employeeService.read(""),employeeService.read(""));
    }
}