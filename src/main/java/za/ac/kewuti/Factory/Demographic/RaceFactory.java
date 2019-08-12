package za.ac.kewuti.Factory.Demographic;

import za.ac.kewuti.Domain.Demographic.Race;
import za.ac.kewuti.Util.Misc;

public class RaceFactory {

    public static Race buildRace(String black, String white, String indian, String colored)
    {
        return new Race.Builder().raceId(Misc.generateId())
                .black(black)
                .white(white)
                .indian(indian)
                .colored(colored)
                .build();
    }
}
