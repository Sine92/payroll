package za.ac.kewuti.Service.Demographic;

import za.ac.kewuti.Domain.Demographic.Gender;
import za.ac.kewuti.Service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
