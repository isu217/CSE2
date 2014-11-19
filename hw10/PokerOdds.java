import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }

    public static boolean hasDups(int n[]) {
        for (int i = 0; i < n.length; i++) {
            for (int k = i + 1; k < n.length; k++) {
                if (n[i] == n[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] showHands() {
        int hand[] = new int[5];
        do {
            for (int i = 0; i < hand.length; i++) {
                int num = (int)((Math.random()) * 52 + 1);
                num = hand[i];
            }
        } while (hasDups(n))
        return n;
    }

    public static void printHand(int n[]) {
        int hearts[] = new int[5];
        int jacks[] = new int[5];
        int queens[] = new int[5];
        int clubs[] = new int[5];
        int heartsInd = 0;
        int jacksInd = 0;
        int queensInd = 0;
        int clubsInd = 0;
        n[] = showHands();
        for (int i = 0; i < n.length; i++) {
            int rank = n[i]%13;
            int suit = n[i]/13;
            if (suit == 0) { //clubs
                    switch (rank) {
                        case 0:
                            hearts[heartsInd] = n[i];
                            heartsInd++;
                            break;
                        case 1:
                            hearts[heartsInd] = n[i];
                            heartsInd++;
                            break;
                        case 2:
                            hearts[heartsInd] = n[i];
                            heartsInd++;
                            break;
                        case 3:
                            hearts[heartsInd] = n[i];
                            heartsInd++;
                            break;
                        case 4:
                            hearts[heartsInd] = n[i];
                            heartsInd++;
                            break;
                        case 5:
                            hearts[heartsInd] = "K";
                            heartsInd++;
                            break;
                        case 6:
                            hearts[heartsInd] = "K";
                            heartsInd++;
                            break;
                        case 7:
                            hearts[heartsInd] = "K";
                            heartsInd++;
                            break;
                        case 8:
                            hearts[heartsInd] = "K";
                            heartsInd++;
                            break;
                        case 9:
                            hearts[heartsInd] = "K";
                            heartsInd++;
                            break;
                }
            }
            else{
                hearts[heartsInd] = n[i] + "";
                heartsInd++;
            }
            
            if(n[i] > 13 && n[i] <= 26){
                if(n[i] >=24){
                    switch(n[i]){
                        case 24:
                            clubs[clubsInd] = "J";
                            clubsInd++;
                        case 25:
                            clubs[clubsInd] = "Q";
                            clubsInd++;
                        case 26:
                            clubs[clubsInd] = "K";
                            clubsInd++;
                        default:
                            clubs[clubsInd] = "A";
                            clubsInd++;
                    }
                }
                
            }
        }
    }
}
