package za.ac.kewuti.Domain.Demographic;

public class Race {

    public String getRaceId() {
        return raceId;
    }

    private String raceId, black,white,indian,colored;

    private Race()
    {

    }
    private Race(Builder build)
    {
        this.black = build.black;
        this.white = build.white;
        this.indian = build.indian;
        this.colored = build.colored;
        this.raceId = build.raceId;

    }

    public String getBlack() {
        return black;
    }

    public String getWhite() {
        return white;
    }

    public String getIndian() {
        return indian;
    }

    public String getColored() {
        return colored;
    }

    public static class Builder {
        private String raceId, black,white,indian,colored;


        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }
        public Builder black(String black)
        {
            this.black = black;
            return this;

        }

        public Builder white(String white)
        {
            this.white = white;
            return this;
        }

        public Builder indian(String indian)
        {
            this.indian = indian;
            return this;
        }
        public Builder colored(String colored)
        {
            this.colored = colored;
            return this;
        }
        public Race build()
        {
            return  new Race(this);
        }
    }
}
