package za.ac.kewuti.Factory.User;

import za.ac.kewuti.Domain.User.EmployeeGender;
import za.ac.kewuti.Util.Misc;

public class EmployeeGenderFactory {

    public static EmployeeGender createEmployeeGender()
    {
        return new EmployeeGender.Builder()
                .empId(Misc.generateId())
                .genderId(Misc.generateId())
                .build();
    }
}
