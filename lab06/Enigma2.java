//isu217
//Ian Udvarhelyi
//10/9/14
//Enigma2 error find

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * the error is in line 9 when out=40/0.
 * the compiler identifies the arithmetic error
 * and says you can't divide by zero.
 * the code compiles but can't run, so its runtime
 * 
 * 
 * 
 * 
 */
