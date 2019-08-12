package za.ac.kewuti.Service.User;

import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
