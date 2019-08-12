package za.ac.kewuti.Service.Demographic;

import za.ac.kewuti.Domain.Demographic.Race;
import za.ac.kewuti.Service.IService;

import java.util.Set;

public interface RaceService extends IService<Race,String> {
    Set<Race> getAllrace();
}
