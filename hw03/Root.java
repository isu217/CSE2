//Ian Udvarhelyi
//hw03-Root
//isu217
//9/12/14
//cube root calculator

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a double and I print the cube root-");
        double number= myScanner.nextDouble();
        double guess= number/3;
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        guess= ((2*guess*guess*guess)+number)/(3*guess*guess);
        double cube= guess*guess*guess;
        System.out.println("The cube root is: "+guess+":");
        System.out.println(+guess+"*"+guess+"*"+guess+"="+cube);
    }
}