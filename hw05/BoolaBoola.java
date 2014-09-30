//isu217
//Ian Udvarhelyi
//hw05
//Program 2
//Boola Boola

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int randExpression1 = (int)(Math.random()*2); //get three random values 
        int randExpression2 = (int)(Math.random()*2);
        int randExpression3 = (int)(Math.random()*2);
        boolean bool1, bool2, bool3; //assign three boolean variables
        if (randExpression1 == 1){ 
            bool1 = true;
        }
        else{
            bool1 = false;
        }
        if (randExpression2 == 1){ 
            bool2 = true;
        }
        else{ 
            bool2 = false;
        }
        if (randExpression3 == 1){ 
            bool3 = true;
        }
        else{ 
            bool3 = false;
        }
        int randOperator1 = (int)(Math.random()*2); //create two random values
        int randOperator2 = (int)(Math.random()*2);
        int control1 = 0;   //create control variables for the operators
        int control2 = 0;
        
        if (bool1 == true){     //create if statement for bool1 being true or false
            System.out.print("Does true ");
        }
        else {
            System.out.print("Does false ");
        }
        switch (randOperator1){         //use switch statement for different possibilites of operator
            case 0:                     
                System.out.print(" &&");
                control1 = 1;           //control = 1 is an &&, 0 is ||
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        if (bool2 == true){
            System.out.print(" true");
        }
        else {
            System.out.print(" false");
        }
        switch (randOperator2){
            case 0:
                System.out.print(" &&");
                control2 = 1;
                break;
            case 1:
                System.out.print(" ||");
                break;
        }
        if (bool3 == true){
            System.out.print(" true");
        }
        else{
            System.out.print(" false");
        }
        System.out.print(" have the value true (t/T) or false (f/F)? ");    //get user answer
        String input = myScanner.next();
        if (control1 == 1 && control2 == 1){        //if both operators are &&
            if ((bool1 && bool2 && bool3) && input.equals("t")){
                System.out.println("You're correct");
            }
            else if (!(bool1 && bool2 && bool3) && input.equals("f")){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Not correct");
            }
        }
        else if (control1 == 1 && control2 == 0){   //if its &&...||
            if ((bool1 && bool2 || bool3) && input.equals("t")){
                System.out.println("You're correct");
            }
            else if (!(bool1 && bool2 || bool3) && input.equals("f")){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Not correct");
            }
        }
        else if (control1 == 0 && control2 == 0){   //if its ||...||
            if ((bool1 || bool2 || bool3) && (input.equals("t") || input.equals("T"))){
                System.out.println("You're correct");
            }
            else if (!(bool1 || bool2 || bool3) && (input.equals("f") || input.equals("F"))){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Not correct");
            }
        }
        else if (control1 == 0 && control2 == 1){   //if its ||...&
            if ((bool1 || bool2 && bool3) && (input.equals("t") || input.equals("T"))){
                System.out.println("You're correct");
            }
            else if (!(bool1 || bool2 && bool3) && (input.equals("f") || input.equals("F"))){
                System.out.println("You're correct");
            }
            else{
                System.out.println("Not correct");
            }
        }
        
    }
}