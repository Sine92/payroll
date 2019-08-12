package za.ac.kewuti.Repository.Demographic.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.Demographic.Race;
import za.ac.kewuti.Factory.Demographic.RaceFactory;

import static org.junit.Assert.*;

public class RaceImplTest {
    private RaceImpl raceRepo;
    private Race race;
    @Before
    public void setUp() throws Exception {
        raceRepo = RaceImpl.getRacerepo();
        race = RaceFactory.buildRace("Africa","Europe","India","Cape");
    }

    @Test
    public void getAll() {
        assertEquals(raceRepo.getAll(),raceRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(raceRepo.create(race),raceRepo.create(race));
    }

    @Test
    public void update() {
        assertEquals(raceRepo.update(race),raceRepo.update(race));
    }

    @Test
    public void delete() {
        raceRepo.delete(race.getRaceId());
    }

    @Test
    public void read() {
        raceRepo.read(race.getRaceId());
    }
}