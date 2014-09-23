//isu217
//Ian Udvarhelyi
//hw04 program 2
//Month program

import java.util.Scanner;

public class Month {
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);                 //declare scanner
        System.out.print("Enter an int giving the number of the month (1-12) ");
        int month = myScanner.nextInt();                    //get user input for which month it is
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            System.out.print("The month has 31 days");      //create if statement for months with 31 days
        }
        else if (month==4 || month==6 || month==9 || month==11) {
            System.out.print("The month has 30 days");      //create if statement for months for 30 days
        }
        else if (month==2) {                                //if the user enters a 2 do seperate calculations for leap year
            System.out.print("Enter an int giving the year ");
            int year = myScanner.nextInt();                 //get user input for year
            double yearRem = year % 4;                      //see if the year is divisible by 4
            if (yearRem == 0) {
                System.out.print("The month has 29 days");  //if the year is divisible by 4 its a leap year
            }
            else if (yearRem!=0) {                          //if the year is not divisible by 4 its not a leap year
                System.out.print("The month has 28 days");
            }
        }
    }
}