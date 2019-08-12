package za.ac.kewuti.Repository.User.impl;

import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Repository.User.EmployeeRepo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImpl implements EmployeeRepo {

    private static EmployeeImpl employeeRepo = null;
    private Set<Employee> employeeSet;

    public static EmployeeImpl getEmployeeRepo()
    {
        if(employeeRepo == null)employeeRepo = new EmployeeImpl();
        return employeeRepo;
    }


    private EmployeeImpl(){
        this.employeeSet = new HashSet<>();
    }
     private Employee findEmployee(String empId)
     {
         return this.employeeSet.stream()
                 .filter(employee -> employee.getEmpId().trim().equals(empId))
                 .findAny()
                 .orElse(null);
     }



    @Override
    public Set<Employee> getAll() {
        return this.employeeSet;
    }

    @Override
    public Employee create(Employee employee) {
        this.employeeSet.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee toDelete = findEmployee(employee.getEmpId());
        if(toDelete != null)
        {
            this.employeeSet.remove(toDelete);
            return create(employee);
        }
        return null;
    }

    @Override
    public void delete(String empId) {
        Employee employee =findEmployee(empId);
        if(employee != null) this.employeeSet.remove(employee);

    }

    @Override
    public Employee read(final String empId) {
        Employee employee =findEmployee(empId);
        return employee;
    }
}
