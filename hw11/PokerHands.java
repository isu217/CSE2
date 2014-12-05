//Ian Udvarhelyi
//hw 11


import java.util.Scanner;
public static class PokerHands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hand[] = new int[13];
        System.out.println("Enter one of A, K, Q, J, 10...etc");
        for(int i = 0; i < 5; i++){//input values into hand array
            switch(scan.next){
                case A:
                    hand[i] = 14;
                    break;
                
                case K:
                    hand[i] = 13;
                    break;
                
                case Q:
                    hand[i] = 12;
                    break;
                
                case J:
                    hand[i] = 11;
                    break;
                
                case 10:
                    hand[i] = 10;
                    break;
                
                case 9:
                    hand[i] = 9;
                    break;
                
                case 8:
                    hand[i] = 8;
                    break;
                
                case 7:
                    hand[i] = 7;
                    break;
                
                case 6:
                    hand[i] = 6;
                    break;
                
                case 5:
                    hand[i] = 5;
                    break;
                
                case 4:
                    hand[i] = 4;
                    break;
                
                case 3:
                    hand[i] = 3;
                    break;
                
                case 2:
                    hand[i] = 2;
                    break;
        }
        System.out.println("Enter the suit: 'c' 'd' 's' 'h'");
        int array[][] = new int[3][];
        int heart = 0; //initilize a frequency count for suits
        int club = 0;
        int spade = 0;
        int diamond = 0;
        switch(scan.next()){
            case c:
                club++;
            case d:
                diamond++;
            case s:
                spade++;
            case h:
                heart++;
        }
    }
    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
}
}