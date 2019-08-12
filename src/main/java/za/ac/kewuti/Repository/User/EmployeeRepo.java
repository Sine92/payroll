package za.ac.kewuti.Repository.User;

import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Repository.Ipayroll;

import java.util.Set;

public interface EmployeeRepo extends Ipayroll<Employee, String> {

    Set<Employee> getAll();
}
