//isu217
//Ian Udvarhelyi
//IncomeTax program
//hw04 program 1

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);                             //declare scanner
        System.out.print("Enter an int giving the number of thousands- ");
        int income = myScanner.nextInt();                   //get user input for scanner
        if (income<20) {                            //create parameters for income
            double taxRate = 5;
            double taxIncome = (income*1000) *.05;          //get input into thousands so you can mupltiply by the taxrate
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome); 
        }                                           //print results
        else if (income>=20 && income<40) {         //create parameters for the next income, do the same calculations as above with different taxrate
            double taxRate = 7;
            double taxIncome = (income*1000) *.07;
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income>=40 && income<78) {         //create parameters for the next income
            double taxRate = 12;
            double taxIncome = (income*1000) *.12;
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income>=78) {                      //create parameters for the next income
            double taxRate = 14;
            double taxIncome = (income*1000) *.14;
            System.out.print("The tax rate on "+(income*1000)+" is "+taxRate+"%, and the tax is "+taxIncome);
        }
        else if (income<0) {                        //if the income is negative print error statement
            System.out.print("You did not enter a positive int");
        }
    }
}