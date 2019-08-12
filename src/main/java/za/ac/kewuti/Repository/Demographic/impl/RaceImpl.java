package za.ac.kewuti.Repository.Demographic.impl;

import za.ac.kewuti.Domain.Demographic.Race;
import za.ac.kewuti.Repository.Demographic.RaceRepo;

import java.util.HashSet;
import java.util.Set;

public class RaceImpl implements RaceRepo {

private static RaceImpl racerepo = null;
private Set<Race> races;

private RaceImpl()
{
    this.races = new HashSet<>();
}

private Race findRace(final String raceId)
{
    return this
            .races
            .stream()
            .filter(race -> race.getRaceId().trim().equals(raceId))
            .findAny()
            .orElse(null);
}
public static RaceImpl getRacerepo()
{
    if(racerepo == null) racerepo = new RaceImpl();
    return racerepo;
}


    @Override
    public Set<Race> getAll() {
        return this.races;
    }

    @Override
    public Race create(Race race) {
    this.races.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
    Race toDelete = findRace(race.getRaceId());
    if(toDelete != null)
    {
        this.races.remove(toDelete);
        return create(race);
    }
        return null;
    }

    @Override
    public void delete(String raceId) {

    Race race = findRace(raceId);
    if(race != null) this.races.remove(race);

    }

    @Override
    public Race read(final String raceId) {
    Race race =findRace(raceId);

        return race;
    }
}
