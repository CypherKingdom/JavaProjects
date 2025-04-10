package java_basics.chap5.sportsplayer;

public class BasketballPlayer extends SportPlayer {

    // public BasketballPlayer(){ //calls default SportPlayer
    //     super();
    // }
    
public BasketballPlayer(String firstName , String lastName , int bestScore , int injuries){
    super(firstName, lastName, bestScore, injuries);
}

    public void play(){
        System.out.println(this.getFirstName() + " is playing Basketball");
        this.throwBall();
    }

    public void throwBall(){
        System.out.println(this.getFirstName() + " throws the ball");
    }

}
