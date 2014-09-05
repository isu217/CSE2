//Ian Udvarhelyi
//9/5/14
//lab02
//Purpose of this program is to calculate the number of minutes, miles, and rotations
//of two biking trips

public class Cyclometer {
    //main method for every program
    public static void main(String[] args) {
        int secsTrip1=480; //seconds per trip1
        int secsTrip2=3220; //seconds per trip2
        int countsTrip1=1561; //rotations for trip1
        int countsTrip2=9037; //rotations for trip2
        double wheelDiameter=27, //wheel diameter
        PI= 3.14159, //value of pi
        feetPerMile=5280, //feet per mile
        inchesPerFoot=12, //inches per foot
        secondsPerMinute=60; //seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance;
            System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute) +
            " minutes and had " +countsTrip1+ " counts.");
            System.out.println("Trip 2 took " +(secsTrip1/secondsPerMinute) +
            " minutes and had " +countsTrip2+ " counts ");
        //Compute all of the calculations
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //^gives distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print out all the outputs
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
            
    } //end of the main method
}