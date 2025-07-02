package GuesserGameProject;
import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Umpire ump = new Umpire();
        System.out.println("=======================================");
        System.out.println("     👋 WELCOME TO THE GUESSER GAME     ");
        System.out.println("=======================================\n");

        System.out.println("Enter Number of Players :");
        int num = sc.nextInt();
        if(num<1) System.out.println("Not possible . Atleast minimum of 1 player required ");
        ump.numberofplayers(num);
        int i=1;
        while(true){
            System.out.println("=======================================");
            System.out.println("        🎮 GUESSER GAME ROUND " + i + "        ");
            System.out.println("=======================================");

            int a=0;
            ump.collectFromGuesser();
            ump.setPlayers(sc);
            ump.compare();
            ump.getScore(i);
            i++;
            System.out.println();
            System.out.println("🔁 Press 1 to exit, or any other number to play next round:");
            a=sc.nextInt();
            if(a==1)break;
        }
        ump.declareWinner();
        System.out.println("\n=======================================");
        System.out.println("         🚀 GAME OVER - THANK YOU       ");
        System.out.println("=======================================\n");

    }
}
