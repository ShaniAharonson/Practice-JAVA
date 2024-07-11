package AllData;

public class Grade {
    public Grade(Profession profession, int score) {
        this.profession = profession;
        this.score = score;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >=40 && score<=100) {
            this.score = score;
        }
    }

    private Profession profession;
    private int score;

    @Override
    public String toString() {
        return " profession = " + profession + "score = " +score;
    }


}
