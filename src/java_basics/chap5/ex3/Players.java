package java_basics.chap5.ex3;

public class Players {
    // Fields
    public Player[] listOfPlayers;
    public int nbOfPlayers;
    // private int countPlayer = 0;

    // constructors
    public Players(int nbOfPlayers) {
        this.listOfPlayers = new Player[nbOfPlayers];
        this.nbOfPlayers = nbOfPlayers;
    }

    // Methods
    public boolean addPlayer(Player p) {
        // this.listOfPlayers[countPlayer] = p;
        // countPlayer++;
        if (isPresent(p)) {
            return false;
        }
        for (int i = 0; i < this.listOfPlayers.length; i++) {
            if (this.listOfPlayers[i] == null) {
                this.listOfPlayers[i] = p;
                return true;
            }
        }
        System.out.println("Error: List of Players is full");
        return false;
    }

    public boolean isPresent(Player p) {
        for (int i = 0; i < this.listOfPlayers.length; i++) {
            if (p.equals(this.listOfPlayers[i]) && this.listOfPlayers[i] != null) {
                return true;
            }
        }
        return false;
    }
}