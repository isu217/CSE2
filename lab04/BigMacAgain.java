//isu217
//lab04
//BigMacAgain


//import scanner
import java.util.Scanner;
//create public class
public class BigMacAgain {
    public static void main(String[] args) {
        double BigMac$ = 2.22;
        double fries$ = 2.15;
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner( System.in );
        System.out.print("Enter number of Big Macs(an integer >0): ");
        int nBigMacs = myScanner.nextInt(); //get input for number of big macs
        if(nBigMacs>=0) {                               //create parameters for number of big macs
            double bigMacCost = nBigMacs*BigMac$;       //get cost of bigmacs
            System.out.printf("You ordered " +nBigMacs+ " for a cost of $"+bigMacCost+".");
        }
        else if(nBigMacs<0) {                           //create error statement for negative bigmacs
            System.out.println("You did not enter an int greater than 0");
            return;
        }
        System.out.print("\nDo you want an order of fries? (Y,y,N,n) ");    //ask user if they want fries
        String response = myScanner.next();                     //create string for user response
        if (response.equals("Y") || response.equals("y")) {     //make if statement for yes
            double bigMacCost = nBigMacs*BigMac$;
            System.out.print("You ordered fries at a cost of $2.15. ");     //print statement of fries and big mac csot
            System.out.println("\nThe total cost of the meal was "+(bigMacCost+fries$));
        }
        else if(response.equals("N") || response.equals("n")) {             //create if statement for no
            double bigMacCost = nBigMacs*BigMac$;                           //print total cost of big macs
            System.out.println("The total cost of the meal was $"+bigMacCost);
        }
        else if(!response.equals("N") || !response.equals("n") || !response.equals("Y") || !response.equals("y")) {
            //above: create else if statement for if the user doesn't enter appropriate character, then print error statement
            System.out.println("You did not enter one of 'Y', 'y', 'N', 'n'");
            return; 
        }
    }
}