//isu217
//Ian Udvarhelyi
//10/14/14
//hw06
//Root program

import java.util.Scanner;

public class Root{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to take the square root of: ");
        int num = scan.nextInt(); //get user input
        double low = 0;
        double high = num +1;
        double middle = (high + low)/2; //create low, high, middle
        boolean test = (high-low) > (.0000001 * high); //create test condition for loop
        while(test == true){
            if((middle*middle) > num){
                high = middle;
                middle = (high+low)/2;
            }
            else if((middle*middle)<num){
                low = middle;
                middle = (high+low)/2;
            } //create conditions for the bisection method
            test = (high-low) > (.0000001 * high); //rerun test at end of while loop
        }
        System.out.println(middle); //print root after loop
    }
}