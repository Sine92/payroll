package za.ac.kewuti.Service.User.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Factory.User.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {
      private  EmployeeGenderServiceImpl employeeGenderService;
      private EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
      employeeGenderService = EmployeeGenderServiceImpl.getService();
      employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void getService() {
        assertEquals(employeeGenderService.getAll(),employeeGenderService.getAll());

    }

    @Test
    public void getAll() {
        assertEquals(employeeGenderService.getAll(),employeeGenderService.getAll());
    }

    @Test
    public void create() {
        assertEquals(employeeGenderService.create(employeeGender),employeeGenderService.create(employeeGender));
    }

    @Test
    public void update() {
        assertNull(employeeGenderService.update(employeeGender));
    }

    @Test
    public void delete() {
        employeeGenderService.delete("");
    }

    @Test
    public void read() {
        employeeGenderService.read("");
    }
}