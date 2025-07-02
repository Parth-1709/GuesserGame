package GuesserGameProject;

public class Guesser {
    int GuesserNum;
    public int GuesserNumb(){
        System.out.println("Guesser has guessed . Players proceed : ");
        GuesserNum=(int)(Math.random()*10);
        return GuesserNum;
    }
}
