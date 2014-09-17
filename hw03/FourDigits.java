//Ian Udvarhelyi
//hw03-FourDigits
//isu217
//9/13/14

import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner; //initialize scanner
        myScanner=new Scanner(System.in);
        //get user input
        System.out.print("Enter a double and I display 4 places to the right of the decimal: ");
        double number= myScanner.nextDouble();
        int intNumber= (int)number;
        //manipulate user input
        number = number * 10000;
        intNumber *= 10000;
        int printNumber = (int)number - intNumber;
        double printNum = number % intNumber;
        //print result
        System.out.println("The digits are "+ (int)printNum);
    }
    
}
    
