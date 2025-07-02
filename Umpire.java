package GuesserGameProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Umpire {
    ArrayList<Integer>winner;
    int n;
    int[] players;
    int[] score;
    int guess;
    public void numberofplayers(int n){
        this.n=n;
        players=new int[n];
        score=new int[n];
    }
    public void setPlayers(Scanner sc){
        Arrays.fill(players,-1);
        for(int i=0;i<n;i++){
            Player p = new Player();
            System.out.println("👉 Player " + (i + 1) + ", please enter your guess (0-9):");
            players[i]=p.PlayerNumb(sc);
        }
        System.out.println();
    }
    public void collectFromGuesser(){
        Guesser g = new Guesser();
        guess=g.GuesserNumb();
    }
    public void compare(){
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(players[i]==guess){
                flag=true;
                score[i]++;
                System.out.println("Player "+(i+1)+" has guessed right");
            }
        }
        if(flag==false) System.out.println("No one guessed right");
        System.out.println("\n🎯 The number was: " + guess + "\n");
    }
    public void getScore(int round){
        System.out.println("------------ 🧮 SCOREBOARD ------------");
        for (int i = 0; i < n; i++){
            System.out.printf("Player %-2d : %2d points\n", (i + 1), score[i]);
        }
        System.out.println("---------------------------------------\n");
    }
    public void declareWinner(){
        int max=score[0];
        winner=new ArrayList<>();
        for(int i=1;i<n;i++){
            max=Math.max(score[i],max );
        }
        for(int i=0;i<n;i++){
            if(score[i]==max){
                winner.add(i+1);
            }
        }
        if(winner.size()==1) System.out.println("Player "+winner.get(0)+" is the winner");
        else{
            System.out.println("🏁 It's a tie between:");
            for(int i=0;i< winner.size();i++){
                System.out.println("Player "+winner.get(i));
            }
        }
    }
}
