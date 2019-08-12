package za.ac.kewuti.Repository.User.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Factory.User.EmployeeGenderFactory;

import static org.junit.Assert.*;

public class EmployeeGenderImplTest {
    private EmployeeGenderImpl employeeGenderRepo;
    private EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
        employeeGenderRepo = EmployeeGenderImpl.getEmployeeGenderRepo();
        employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void getAll() {
        assertEquals(employeeGenderRepo.getAll(),employeeGenderRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(employeeGenderRepo.create(employeeGender)
                ,employeeGenderRepo.create(employeeGender));
    }

    @Test
    public void update() {
        assertEquals(employeeGenderRepo.update(employeeGender)
                ,employeeGenderRepo.update(employeeGender));
    }

    @Test
    public void delete() {
        employeeGenderRepo.delete(employeeGender.getEmpId());
    }

    @Test
    public void read() {
        employeeGenderRepo.read(employeeGender.getEmpId());
    }
}