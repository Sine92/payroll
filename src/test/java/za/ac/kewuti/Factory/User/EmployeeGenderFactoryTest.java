package za.ac.kewuti.Factory.User;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.EmployeeGender;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {
    private EmployeeGender employeeGender;
    @Before
    public void setUp() throws Exception {
        employeeGender = EmployeeGenderFactory.createEmployeeGender();
    }

    @Test
    public void createEmployeeGender() {
        assertEquals(employeeGender.getEmpId(),employeeGender.getEmpId());
    }
}