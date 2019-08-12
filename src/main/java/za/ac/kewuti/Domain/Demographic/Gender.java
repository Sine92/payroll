package za.ac.kewuti.Domain.Demographic;

public class Gender {

    private String genderId,male,female;

    public String getGenderId() {
        return genderId;
    }

    private Gender()
    {


    }
    private Gender (Builder build)
    {
        this.genderId = build.genderId;
        this.female = build.female;
        this.male = build.male;

    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }
    public static class Builder{

        private String genderId,male,female;

        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public Builder male(String male)
        {
            this.male = male;
            return this;
        }
        public Builder female (String female)
        {
            this.female = female;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }
    }
}
