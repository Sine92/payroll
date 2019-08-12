package za.ac.kewuti.Repository.Demographic.impl;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.Demographic.Gender;
import za.ac.kewuti.Factory.Demographic.GenderFactory;

import static org.junit.Assert.*;

public class GenderImplTest {
private GenderImpl genderRepo;
private Gender gender;
    @Before
    public void setUp() throws Exception {
        genderRepo = GenderImpl.getGenderRepo();
        gender = GenderFactory.buildGender("Male","Female");
    }
    @Test
    public void getAll() {
        assertEquals(genderRepo.getAll(),genderRepo.getAll());
    }

    @Test
    public void create() {
        assertEquals(genderRepo.create(gender),genderRepo.create(gender));
    }

    @Test
    public void update() {
        assertEquals(genderRepo.update(gender),genderRepo.update(gender));
    }

    @Test
    public void delete() {
        genderRepo.delete(gender.getGenderId());
    }

    @Test
    public void read() {
        genderRepo.read(gender.getGenderId());
    }


}