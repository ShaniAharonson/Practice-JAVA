package cls;

public class Grade {
    // attributes
    private int score;
    private String profession;

    public static final String[] VALID_PROFESSIONS = {
            "math", "chemistry", "geography", "literature", "physics", "sports"
    };

    public Grade(String profession, int score) {
        setProfession(profession);
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 40 || score > 100) {
            throw new IllegalArgumentException("Score must be between 40 to 100");
        }
        this.score = score;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        if (!isValidProfession(profession)) {
            throw new IllegalArgumentException("Invalid profession: " + profession + ". Must be one of " + String.join(", ", VALID_PROFESSIONS));
        }
        this.profession = profession;
    }


    private boolean isValidProfession(String profession) {
        for (String validProfession : VALID_PROFESSIONS) {
            if (validProfession.equals(profession)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "score=" + score +
                ", profession='" + profession + '\'' +
                '}';
    }
}

