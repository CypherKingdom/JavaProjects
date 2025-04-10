package java_basics.chap5.sportsplayer;

public class FootballPlayer extends SportPlayer {
    public FootballPlayer(String firstName , String lastName , int bestScore , int injuries){
        super(firstName , lastName , bestScore , injuries);
    }
    @Override
    public void play(){
        System.out.println(this.getFirstName()+" "+this.getLastName()+ " " + "playing football");
        this.throwBall();
    }

    public void throwBall(){
        System.out.println(this.getFirstName()+" "+this.getLastName()+" "+ "throws the ball");
    }
}
