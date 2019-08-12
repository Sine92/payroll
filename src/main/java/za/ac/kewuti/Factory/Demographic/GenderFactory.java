package za.ac.kewuti.Factory.Demographic;

import za.ac.kewuti.Domain.Demographic.Gender;
import za.ac.kewuti.Util.Misc;

public class GenderFactory {

    public static Gender buildGender(String male,String female){

        return  new Gender.Builder().genderId(Misc.generateId())
                .male(male)
                .female(female)
                .build();

    }

}
