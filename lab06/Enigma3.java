//isu217
//Ian Udvarhelyi
//10/9/14
//Enigma3 error find

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String[] args){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          System.out.println(n+" "+k);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println(n+" "+k);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
      System.out.println(n+" "+k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println(n+" "+k);
      default:
        n-=3;
        k-=5;
        System.out.println(n+" "+k);
    }
     //out+=1/n + 1/k;   
   // System.out.println(out);
  }
}

/*
 * Error report:
 * k=0 in like 50 when k initially equals 5
 * but then 5 is subtracted from k to make it 0
 * so when we make out+=1/n + 1/k
 * were dividing by 0 creating a runtime error
 */
