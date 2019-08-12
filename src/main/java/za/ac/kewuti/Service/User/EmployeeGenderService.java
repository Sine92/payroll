package za.ac.kewuti.Service.User;

import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {

    Set<EmployeeGender> getAll();
}
