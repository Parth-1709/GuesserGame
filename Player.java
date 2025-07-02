package GuesserGameProject;

import java.util.Scanner;

public class Player {
    int PlayerNum;
    public int PlayerNumb(Scanner sc){
        while(true){
            PlayerNum=sc.nextInt();
            if(PlayerNum>=0 && PlayerNum<10){
                return PlayerNum;
            }
            else System.out.println("invalid input. Guess Again");

        }
    }
}
