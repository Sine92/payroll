package za.ac.kewuti.Factory.User;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.User.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {
private EmployeeFactory employeeFactory;
private Employee employee;
    @Before
    public void setUp() throws Exception {
        employee =  EmployeeFactory.createEmployee("Sinetemba",
                "Kewuti",
                "017");
    }

    @Test
    public void createEmployee() {
        assertEquals(employee.getEmpLastName(),"Kewuti");
    }
}