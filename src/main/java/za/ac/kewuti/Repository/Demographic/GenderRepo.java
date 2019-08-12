package za.ac.kewuti.Repository.Demographic;

import za.ac.kewuti.Domain.Demographic.Gender;
import za.ac.kewuti.Repository.Ipayroll;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GenderRepo extends Ipayroll<Gender, String> {

    Set<Gender> getAll();
}
