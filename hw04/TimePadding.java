//isu217
//Ian Udvarhelyi
//hw04 program 4
//Time Padding

import java.util.Scanner;

public class TimePadding {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);             //decalre scanner
        System.out.print("Enter the time in seconds: ");
        int intSeconds = myScanner.nextInt();         //get user input for seconds
        double hours = (intSeconds / 3600.0);         //divide by 3600 to get seconds into hours
        int hours2 = (int)hours;                 //cast hours into an int
        double hours3 = hours - hours2;         //subtract int version of hours from hours to get minutes in hours
        double minutes = hours3 * 60;           //convert minutes in hours to just minutes
        int minutes2 = (int)(minutes);          //cast minutes into an int
        double minutes3 = minutes - minutes2;   //subtract int version of minutes from minutes to get seconds in minutes
        int seconds = (int)(minutes3 * 60);     //convert seconds in minutes to seconds
        if (minutes2 < 10){                     //create parameters for the padding 0
            System.out.print(hours2 + ":0" + minutes2);
        }
        else{
            System.out.print(hours2 + ":" + minutes2);
        }
        if (seconds < 10){                      //create parameters for the padding 0
            System.out.print(":0" + seconds);
        }
        else{
            System.out.print(":" + seconds);
        }
        System.out.println();
    }
}