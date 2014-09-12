//Ian Udvarhelyi
//Lab03
//isu217
//9/12/14
//Big Mac

//import scanner
import java.util.Scanner;
//create public class
public class BigMac {
    //create main method
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner( System.in );
        System.out.print("Enter number of Big Macs(an integer >0): ");
        int nBigMacs = myScanner.nextInt(); //get input for number of big macs
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx):");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as awhole number (xx):");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; //the user input is percent, but I want proportion
        double cost$;
        int dollars, //whole dollar amount of cost
            dimes,pennies; //for storing digits to right of decimal for the cost$
        cost$= nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //(int)(6.73*10) % 10->67 %10->10
        //where the % (mod) operator returns the remainder after the division
        //583%100->83, 27%5-> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +
        " per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
            
        
    } //end of main method
} //end of class