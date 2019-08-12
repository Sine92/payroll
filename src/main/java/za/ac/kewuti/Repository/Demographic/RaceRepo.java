package za.ac.kewuti.Repository.Demographic;

import za.ac.kewuti.Domain.Demographic.Race;
import za.ac.kewuti.Repository.Ipayroll;

import java.util.Set;

public interface RaceRepo extends Ipayroll<Race , String> {
    Set<Race> getAll();
}
