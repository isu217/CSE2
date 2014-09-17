//Ian Udvarhelyi
//hw03-Root
//isu217
//9/12/14
//cube root calculator

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner myScanner; //initialize scanner
        myScanner=new Scanner(System.in);
        System.out.print("Enter a double and I print the cube root-");
        //create variable from user input
        double number= myScanner.nextDouble();
        double guess= number/3;
        //start computations of the guess
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        //create final guess of the cube root
        double cube= guess*guess*guess;
        //print out guess of cube root
        System.out.println("The cube root is: "+guess+":");
        System.out.println(+guess+"*"+guess+"*"+guess+"="+cube);
    }
}