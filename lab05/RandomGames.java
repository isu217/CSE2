import java.util.Scanner;

public class RandomGames{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card: ");
        String input = myScanner.next();
        char letter = input.charAt(0);
        int card = (int)(Math.random()*13);
        int suit = (int)(Math.random()*4);
        int roul = (int)(Math.random()*37);
        int craps = (int)(Math.random()*6);
        int craps1 = (int)(Math.random()*6);
        int result = craps + craps1;
        switch (letter){
            case 'R':
                System.out.println("Roulette: "+roul);
                break;
            case 'r':
                System.out.println("Roulette: "+roul);
                break;
            case 'C':
                System.out.println("Craps: "+craps+"+"+craps1+"="+result);
                break;
            case 'c':
                System.out.println("Craps: "+craps+"+"+craps1+"="+result);
                break;
            case 'P':
                switch (card){
                    case 11:
                        System.out.print("Jack");
                        break;
                    case 12:
                        System.out.print("Queen");
                        break;
                    case 13:
                        System.out.print("King");
                        break;
                    case 0:
                        System.out.print("Ace");
                        break;
                    default:
                        System.out.print(card);
                        break;
                }
                switch (suit){
                    case 0:
                        System.out.print(" of Spades");
                        break;
                    case 1:
                        System.out.print(" of Diamonds");
                        break;
                    case 2:
                        System.out.print(" of Hearts");
                        break;
                    case 3:
                        System.out.print(" of Clubs");
                        break;
                }
                System.out.println();
                break;
            case 'p':
                switch (card){
                    case 11:
                        System.out.print("Jack");
                        break;
                    case 12:
                        System.out.print("Queen");
                        break;
                    case 13:
                        System.out.print("King");
                        break;
                    case 0:
                        System.out.print("Ace");
                        break;
                    default:
                        System.out.print(card);
                        break;
                }
                switch (suit){
                    case 0:
                        System.out.print(" of Spades");
                        break;
                    case 1:
                        System.out.print(" of Diamonds");
                        break;
                    case 2:
                        System.out.print(" of Hearts");
                        break;
                    case 3:
                        System.out.print(" of Clubs");
                        break;
                }
                System.out.println();
                break;
            default:
                System.out.println("Enter either 'R', 'r', 'C', 'c', 'P', 'p'");
                break;
        }
    }
}