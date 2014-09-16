//Ian Udvarhelyi
//hw03-Bicyle
//isu217
//9/12/14
//Bicycle program

//import scanner
import java.util.Scanner;
//create public class
public class Bicycle {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        System.out.print("Enter the number of seconds:"); //get user input for seconds
        double secTrip= myScanner.nextDouble();
        System.out.print("Enter the number of counts:"); //get user input for number of counts
        double countTrip= myScanner.nextDouble();
        double wheelDiameter= 27, //assign fixed variables for calculations
        PI= 3.14159,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
        double distanceTrip,timeTrip,mph; //assign double varriables distance, time, mph
        distanceTrip=countTrip*wheelDiameter*PI; //calculate distance of trip
        distanceTrip/=inchesPerFoot*feetPerMile; //convert the distance into miles
        timeTrip=secTrip/secondsPerMinute; //calculate time of trip in minutes
        mph=(distanceTrip)/(timeTrip/60); //calculate miles per hour during trip
        
        distanceTrip=distanceTrip*100; //multiply distance by 100, cast to int, divide by 100 for 2 decimal points
        distanceTrip=(int)distanceTrip;
        distanceTrip/=100;
        
        timeTrip=timeTrip*100; //multiply time by 100, cast to int, divide by 100 for 2 decimal points
        timeTrip=(int)timeTrip;
        timeTrip/=100;
        
        mph=mph*100; //multiply mph by 100, cast to int, divide by 100 for 2 decimal points
        mph=(int)mph;
        mph/=100;
        
        //print out results
        System.out.println("The distance was "+distanceTrip+" and took "+timeTrip+"minutes");
        System.out.println("The average mph was "+mph);
        
        
    }//end main method
}//end of class