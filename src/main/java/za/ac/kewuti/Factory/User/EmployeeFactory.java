package za.ac.kewuti.Factory.User;

import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Util.Misc;

public class EmployeeFactory {

    public static Employee createEmployee(String empName, String empLastName, String empNumber)
    {
        return new Employee.Builder().empId(Misc.generateId())
                .empName(empName)
                .empLastName(empLastName)
                .empNumber(empNumber)
                .build();
    }

}
