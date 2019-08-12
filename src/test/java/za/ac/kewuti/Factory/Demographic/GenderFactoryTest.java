package za.ac.kewuti.Factory.Demographic;

import org.junit.Before;
import org.junit.Test;
import za.ac.kewuti.Domain.Demographic.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest {
    private Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender("Boy","Girl");
    }

    @Test
    public void buildGender() {
        assertEquals(gender.getFemale(),"Girl");
    }
}