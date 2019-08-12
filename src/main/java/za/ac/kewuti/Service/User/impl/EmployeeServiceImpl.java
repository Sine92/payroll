package za.ac.kewuti.Service.User.impl;

import za.ac.kewuti.Domain.User.Employee;
import za.ac.kewuti.Repository.User.impl.EmployeeImpl;
import za.ac.kewuti.Service.User.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService  {

    private static EmployeeServiceImpl service = null;
    private EmployeeImpl empRepo;

   private EmployeeServiceImpl()
   {
       this.empRepo = EmployeeImpl.getEmployeeRepo();
   }

    public static EmployeeServiceImpl getService(){
        if(service == null) service = new EmployeeServiceImpl();
        return service;
    }



    @Override
    public Set<Employee> getAll() {
        return this.empRepo.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.empRepo.update(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.empRepo.update(employee);
    }

    @Override
    public void delete(String s) {
        this.empRepo.delete(s);

    }

    @Override
    public Employee read(String s) {
        return this.empRepo.read(s);
    }
}
