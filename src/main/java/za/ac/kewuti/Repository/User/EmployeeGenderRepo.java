package za.ac.kewuti.Repository.User;

import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Repository.Ipayroll;

import java.util.Set;

public interface EmployeeGenderRepo extends Ipayroll<EmployeeGender , String> {

    Set<EmployeeGender> getAll();
}
