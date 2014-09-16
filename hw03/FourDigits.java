//Ian Udvarhelyi
//hw03-FourDigits
//isu217
//9/13/14

import java.util.Scanner;

public class FourDigits {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a double and I display 4 places to the right of the decimal: ");
        double number= myScanner.nextDouble();
        int intNumber= (int)number;
        number = number * 10000;
        intNumber *= 10000;
        int printNumber = (int)number - intNumber;
        double printNum = number % intNumber;
        System.out.println("The digits are "+ (int)printNum);
    }
    
}
    
