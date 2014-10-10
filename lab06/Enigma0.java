//isu217
//Ian Udvarhelyi
//10/9/14
//Enigma0 error find

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
  public static void main(String[] args){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    //if(scan.hasNextInt()){
      System.out.println("You entered "+n);
    //}
    /*else{
      n=4;
      System.out.println("You entered "+n);
    }*/
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *  In line 11 it should read public static void main(String[] args){
 *  In line 28 the variable n has no value because it was defined as
 scan.nextInt() inside the if scope started in line 14. Fix by
 defining it outside of that scope.
 *   Explain the error(s) that occurred here, and then fix them
 */
