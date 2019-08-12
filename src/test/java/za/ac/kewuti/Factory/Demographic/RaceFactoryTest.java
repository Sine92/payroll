package za.ac.kewuti.Factory.Demographic;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.Demographic.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {
    private Race race;
    @Before
    public void setUp() throws Exception {
        race = RaceFactory.buildRace("African","Europe","India","Cape");
    }

    @Test
    public void buildRace() {
        assertEquals(race.getRaceId(),race.getRaceId());
    }
}