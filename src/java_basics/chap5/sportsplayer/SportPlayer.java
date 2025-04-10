package java_basics.chap5.sportsplayer;

public abstract class SportPlayer {
    private String firstName, lastName;
    public int bestScore;
    public int injuries;

    // public SportPlayer(){}

    public SportPlayer(String firstName, String lastName, int bestScore, int injuries) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestScore = bestScore;
        this.injuries = injuries;
    }

    public abstract void play();

    public void updateScore(int score) {
        if (this.bestScore < score) {
            this.bestScore = score;
        }
    }

    public void addInjury() {
        this.injuries++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Sport player " + this.getFirstName() + " " + this.getLastName();
    }
}
