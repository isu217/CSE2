//isu217
//Ian Udvarhelyi
//10/28/14
//HW8

import java.util.Scanner;
public class HW8{
  
  public static char getInput(Scanner input, String chars){
    
    while(true){
    
      String value = input.next();
    
      if(value.length() != 1){ //test to see if its greater than length 1
        System.out.print("You should enter exactly one character- ");
      }
    
      else{
        char ch = value.charAt(0); //look at first character
    
        if(chars.indexOf(ch) != -1){ //if it is one of the chars we want, return it
          return ch;
        }
        else{ //if its not, then dont return it and say try again
            System.out.print("You did not enter a character from the list " 
            + chars +"; try again- ");
        }
      }
    }
  }
  
  public static char getInput(Scanner input, String chars, int iterations){
    
    for (int i = 0; i < iterations; i++){ //define the for loop
    
      String value = input.next(); 
    
      if(value.length() != 1){ //test if lenght is over one
        System.out.print("You should enter exactly one character- ");
      }
    
      else{
        char ch = value.charAt(0);
    
        if(chars.indexOf(ch) != -1){ //look to see if the character is in the desired list
          return ch;
        }
        else{ //if its not, prompt them again, terminates after 5 times
            System.out.print("You did not enter a character from the list " 
            + chars +"; try again- ");
        }
      }
    }
    System.out.println(); //print error message
    System.out.println("You failed after " + iterations + " tries");
    return ' ';
  }
  
  public static char getInput(Scanner input, String prompt, String chars){
    
    while(true){
    
      System.out.println(prompt);
      System.out.print("Enter on of: ");
      for(int i = 0; i < chars.length(); i++){ //define for loop
        System.out.print("'" + chars.charAt(i) + "', "); //print out all the options
      }
      System.out.print("- ");
      String value = input.next();
      System.out.println();
    
      if(value.length() != 1){ //test for length
        System.out.println("Enter exactly one character");
      }
    
      else{
        char ch = value.charAt(0);
    
        if(chars.indexOf(ch) != -1){ //test if its desired char
          return ch;
        }
        else{ //error message
            System.out.println("You did not enter an acceptable character ");
        }
      }
    }
  }
  
  //given code
  public static void main(String []arg){
	char input; 
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'"); 
  }
  
}
