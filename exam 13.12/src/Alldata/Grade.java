package Alldata;

public class Grade {
    public Grade(Values profession, int score) {
        Profession = profession;
        this.score = score;
    }

    public Values getProfession() {
        return Profession;
    }

    public Values getV() {
        return v;
    }

    public void setV(Values v) {
        this.v = v;
    }

    private Values v;

    public void setProfession(Values value) {
        v = value;

    }


    public int getScore() {
        return score;
    }

    public void setScore(int value) {
        if (value >= 40 && value <= 100) {
            score = value;
        }
    }

    private Values Profession;
    private int score;

    public String toString() {
        return "profession: " + getProfession() + "score: " + getScore();
    }
}
