//isu217
//Ian Udvarhelyi
//hw05
//Program 1
//Burger King


import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter a letter to indicate a choice of:\n\tBurger (B or b)\n\tSoda (S or s)\n\tFries (F or f): ");
        String input = myScanner.next();        //get user input
        char letter = input.charAt(0);
        switch (letter){
            case 'B': case 'b':     //if they enter b for burger
                System.out.print("Enter A or a for all the 'fixins'\nC or c for chesse\nN or n for none of the above: ");
                String burger = myScanner.next();   //get user input
                char cheese = burger.charAt(0);
                switch (cheese){        //create cases for a,c,n
                    case 'A': case 'a':
                        System.out.println("You ordered a burger with all the fixings.");
                        break;
                    case 'C': case 'c':
                        System.out.println("You ordererd a burger with cheese.");
                        break;
                    case 'N': case 'n':
                        System.out.println("You ordered a burger.");
                        break;
                    default:
                        System.out.println("You did not enter A, a, C, c, N, n.");
                        break;
                }
                break;
            case 'S': case 's':     //if they type s for soda
                System.out.print("Do you want a Coke (C or c),\n\tPepsi (P or p),\n\tSprite (S or s),\n\tor Mountain Dew (M or m): ");
                String soda = myScanner.next();
                char drink = soda.charAt(0);
                switch (drink){     //create cases for c,p,s,m
                    case 'c': case 'C':
                        System.out.println("You ordered a Coke.");
                        break;
                    case 'P': case 'p':
                        System.out.println("You orderd a Pepsi.");
                        break;
                    case 'S': case 's':
                        System.out.println("You ordered a Sprite.");
                        break;
                    case 'M': case 'm':
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    default:
                        System.out.println("You did not enter C, c, P, p, S, s, M, or m.");
                        break;
                }
                break;
            case 'F': case 'f': //if they type f for fries
                System.out.print("Do you want a large (L or l) or small (S or s) order of fries: ");
                String fries = myScanner.next();
                char food = fries.charAt(0);
                switch(food){       //create cases for l,s
                    case 'L': case 'l':
                        System.out.println("You ordered large fries.");
                        break;
                    case 'S': case 's':
                        System.out.println("You ordered small fries.");
                        break;
                    default:
                        System.out.println("You did not enter L,l,S, or s.");
                        break;
                }
                break;
            default:    //if they dont enter valid entry
                System.out.println("You did not enter B, b, S, s, F, or f.");
                break;
        }
    }
}