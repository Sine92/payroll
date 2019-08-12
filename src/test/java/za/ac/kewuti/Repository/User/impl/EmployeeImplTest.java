package za.ac.kewuti.Repository.User.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Factory.User.EmployeeFactory;

import static org.junit.Assert.*;

public class EmployeeImplTest {
    private EmployeeImpl employeeRepo;
    private Employee employee;
    @Before
    public void setUp() throws Exception {
        employeeRepo = EmployeeImpl.getEmployeeRepo();
        employee = EmployeeFactory.createEmployee("Sine","Kewuti",
                "12");
    }

    @Test
    public void getAll() {
        assertEquals(employeeRepo.getAll(),employeeRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(employeeRepo.create(employee),employeeRepo.create(employee));
    }

    @Test
    public void update() {
        assertEquals(employeeRepo.update(employee),employeeRepo.update(employee));
    }

    @Test
    public void delete() {
        employeeRepo.delete(employee.getEmpId());
    }

    @Test
    public void read() {
        employeeRepo.read(employee.getEmpId());
    }
}