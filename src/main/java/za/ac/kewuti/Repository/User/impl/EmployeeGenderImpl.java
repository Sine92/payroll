package za.ac.kewuti.Repository.User.impl;

import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Repository.User.EmployeeGenderRepo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderImpl implements EmployeeGenderRepo {
    private static EmployeeGenderImpl employeeGenderRepo = null;
    private Set<EmployeeGender> employeeGenderSet;

    private EmployeeGenderImpl()
    {
        this.employeeGenderSet = new HashSet<>();
    }
    public static EmployeeGenderImpl getEmployeeGenderRepo()
    {
        if(employeeGenderRepo == null)employeeGenderRepo = new EmployeeGenderImpl();
        return employeeGenderRepo;
    }


    @Override
    public Set<EmployeeGender> getAll() {
        return this.employeeGenderSet;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        if(read(employeeGender.getEmpId())==null){
            this.employeeGenderSet.add(employeeGender);
        }
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        if (read(employeeGender.getEmpId()) != null){

        delete(employeeGender.getEmpId());
        create(employeeGender);}



        return read(employeeGender.getEmpId());
    }

    @Override
    public void delete(String s) {
EmployeeGender employeeGender = read(s);
this.employeeGenderSet.remove(employeeGender);
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenderSet.stream()
                .filter(employeeGender -> s.equalsIgnoreCase(employeeGender.getEmpId()
                )).findAny().orElse(null);
    }
}
