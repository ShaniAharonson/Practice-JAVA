import src.Proffesion;

import java.util.Objects;

public class Grade {
    private Proffesion proffesion;
    private int score;

    public Grade(Proffesion proffesion, int score) {
        this.proffesion = proffesion;
        this.score = score;
    }

    public Proffesion getProffesion() {
        return proffesion;
    }

    public void setProffesion(Proffesion proffesion) {
        this.proffesion = proffesion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "proffesion=" + proffesion +
                ", score=" + score +
                '}';
    }
}
