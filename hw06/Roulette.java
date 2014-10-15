//isu217
//Ian Udvarhelyi
//10/14/14
//hw06
//Roulette program

import java.util.Scanner;

public class Roulette {
    public static void main(String[] args){
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Enter a number to bet on: ");
        int bet = scan.nextInt();
        int trials = 0; //initialize all counting variables
        int numLose = 0;
        int numWin = 0; 
        int profit = 0;
        int threeWin = 0;
        int allLose = 0;
        int lose = 0;
        int win = 0;
        while(trials < 1000){ //1000 trials for 100 spins
            int count = 0;
            while(count < 100){ //100 spins 
                win = 0;
                int num = (int)(Math.random()*39);
                if(num == bet){
                    numWin++;
                    profit+= 36;
                    win++;
                }
                else{
                    numLose++;
                    profit-= 1;
                }
                count++;
            }
            if(win >= 3){ //if your number comes up 3 times, count one for threeWin
                threeWin++;
            }
            else if (win == 2 || win == 1){ //if its 2 or 1, not 0, you lose money that round of 100
                lose++;
            }
            else if(win == 0){ //if its 0 you lose all your money that round of 100
                allLose++;
            }
            trials++; //add one to trials
        }
        //print out all needed info about the spins and trials
        System.out.println("The amount of times you lose a bet is: "+ numLose);
        System.out.println("The amount of times you win a bet is: "+ numWin);
        System.out.println("Your total profit is: $"+ profit);
        System.out.println("You profited "+threeWin+" rounds out of 1000");
        System.out.println("You lost money "+lose+" rounds out of 1000");
        System.out.println("You lost all your money "+allLose+" rounds out of 1000");
    }
}