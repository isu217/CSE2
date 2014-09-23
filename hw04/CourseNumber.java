//isu217
//Ian Udvarhelyi
//hw04 program 3
//Course Number porgram

import java.util.Scanner;

public class CourseNumber {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);             //declare scanner
        System.out.println("Enter a six digit number giving the course semester- ");
        String number = myScanner.next();
        char[] myNumber = number.toCharArray(); //looked up how to do arrays
        if(myNumber.length > 6 || myNumber.length < 6){         //forces the length to be equal to 6
            System.out.println("The number you entered did not correct number of digits");
        }
        int year = Integer.parseInt("" + myNumber[0] + myNumber[1] //looked up Integer.parseInt, wanted to cast string year to integer
        + myNumber[2] + myNumber[3]);                   //draws individual chars from array, then casts them to an integer number
        if(year < 1865 || year > 2014) {            //create parameters for the year
            System.out.println("The Course Number you entered was out of range [186510,201440]");
            return;             //if year is out of range return to beginning
        }
        int semester = Integer.parseInt("" + myNumber[4] + myNumber[5]); //examine last two numbers of 6 digit, cast them to string then cast that string to an int
        if(semester % 10 != 0){                                         //make sure the semester is divisable by 10 to eliminate #s like 33
            System.out.println("Not a valid Course Number");
            return;
        }
        if(semester==10) {                      //run through different parameters and their consequences for the last two digits
            System.out.println("The course was offered in the Spring semester of " + year);         //pring the results
        }
        else if(semester==20){
            System.out.println("The course was offered in Summer 1 of " + year);
        }
        else if(semester==30){
            System.out.println("The course was offered in Summer 2 of " + year);
        }
        else if(semester==40){
            System.out.println("The course was offered in the Fall of " + year);
        }
        else if(semester>40){                                           //make sure semester is less than 40
            System.out.println("You did not enter a valid semester code");
        }
        
    }
}