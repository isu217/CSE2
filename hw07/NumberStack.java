//isu217
//Ian Udvarhelyi
//10/12/14
//hw07
//Number Stack

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
            int num = scan.nextInt();
            System.out.println();
            System.out.println("For Loop");
            System.out.println();
            int oddCounter = 1;
            for(int i=1; i<=num; i++) {
                for(int k = 0; k < i; k++){
                for(int j=0; j<oddCounter; j++){
                    System.out.print(i);
                }
                System.out.println();
                }
                for(int d = 0; d < oddCounter; d++){
                    System.out.print("-");
                }
                System.out.println();
                oddCounter += 2;
            }
            System.out.println();
            System.out.println("While Loop");
            System.out.println();
            int m = 1;
            int n = 0;
            int o = 0;
            int p = 0;
            int oddCount = 1;
            while(m <= num){
                while(n < m){
                    while(o < oddCount){
                        System.out.print(m);
                        o++;
                    }
                    System.out.println();
                    n++;
                    o = 0;
                }
                while(p < oddCount){
                    System.out.print("-");
                    p++;
                }
                System.out.println();
                oddCount += 2; 
                m++;
                n = 0;
                p = 0;
            }
            
            System.out.println();
            System.out.println("Do-While Loop");
            System.out.println();
            
            int x = 1;
            int y = 0;
            int z = 0;
            int a = 0;
            int oddCnt = 1;
            do{
                do{
                    do{
                       System.out.print(x);
                        z++; 
                    }while(z < oddCnt);
                    System.out.println();
                    y++;
                    z = 0;
                }while(y < x);
                do{
                    System.out.print("-");
                    a++;
                }while(a < oddCnt);
                System.out.println();
                oddCnt += 2; 
                x++;
                a = 0;
                y = 0;
            
            }while(x <= num);
            
    }
}