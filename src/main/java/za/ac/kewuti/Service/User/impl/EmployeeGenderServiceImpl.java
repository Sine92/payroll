package za.ac.kewuti.Service.User.impl;


import za.ac.kewuti.Domain.User.EmployeeGender;

import za.ac.kewuti.Repository.User.impl.EmployeeGenderImpl;
import za.ac.kewuti.Service.User.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
private static EmployeeGenderServiceImpl service = null;
private EmployeeGenderImpl repo;
private EmployeeGenderServiceImpl()
{
    this.repo = EmployeeGenderImpl.getEmployeeGenderRepo();
}
public static EmployeeGenderServiceImpl getService()
{
    if(service == null)service = new EmployeeGenderServiceImpl();
    return service;
}
    @Override
    public Set<EmployeeGender> getAll() {
    return  repo.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repo.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        return repo.update(employeeGender);
    }

    @Override
    public void delete(String s) {
    repo.delete(s);

    }

    @Override
    public EmployeeGender read(String s) {
        return repo.read(s);
    }
}
