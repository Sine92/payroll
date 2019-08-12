package za.ac.kewuti.Repository.Demographic.impl;

import za.ac.kewuti.Domain.Demographic.Gender;
import za.ac.kewuti.Repository.Demographic.GenderRepo;

import java.util.HashSet;
import java.util.Set;

public class GenderImpl implements GenderRepo {

    private static GenderImpl genderRepo = null;
    private Set<Gender> genders;

    private GenderImpl(){
        this.genders = new HashSet<>();
    }
    private Gender findGender(String genderId)
    {
        return this.genders.stream().filter(gender -> gender.getGenderId().trim().equals(genderId))
                .findAny()
                .orElse(null);
    }
  public static GenderImpl getGenderRepo()
  {
      if(genderRepo == null) genderRepo = new GenderImpl();
      return genderRepo;
  }

    @Override
    public Set<Gender> getAll() {
        return this.genders;
    }

    @Override
    public Gender create(Gender gender) {
        this.genders.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender toDelete = findGender(gender.getGenderId());
        if(toDelete != null){
            this.genders.remove(toDelete);
            return create(gender);
        }
        return null;
    }

    @Override
    public void delete(String genderId) {
        Gender gender = findGender(genderId);
        if(gender != null) this.genders.remove(gender);

    }

    @Override
    public Gender read(final String genderId) {
        Gender gender = findGender(genderId);
        return gender;
    }
}
