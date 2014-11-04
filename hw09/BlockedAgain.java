//isu217
//Ian Udvarhelyi
//11/4/14
//HW9
//Subproblems w/ methods


import java.util.Scanner;

public class BlockedAgain {
    
    public static boolean checkInt(String s){
        Scanner intScan = new Scanner(s); //scan in the string s
        if(intScan.hasNextInt()){ //see if the string is an integer
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkRange(int m){ //check the range of the int
            if(m >= 1 && m <= 9){ //see if its in 1-9
                return true;
            }
            return false;
    }
    
    public static int getInt(){
        System.out.println("Enter and integer between 1-9: ");
        Scanner scan = new Scanner(System.in); 
        String in = scan.next();//scan in user input
        while(true){ //create while true loops to keep repeating
            if(checkInt(in)){ //input user input into checkInt method, if its true continue
                int x = Integer.parseInt(in); //convert to integer
                if(checkRange(x)){ //check the range, if true continue
                    return x; //return user input
                }
                else{ //error message if its out of range
                    if(!checkRange(x)){
                        System.out.print("Did not enter an integer in range 1-9, try again: ");
                        in = scan.next(); //get new input
                    }
                }
            }
            else{
                if(!checkInt(in)){ //error message if its not an int
                    System.out.print("You did not enter an integer, try again: ");
                    in = scan.next(); //get new input
                }
            }
        }
    }
    
    public static void line(int m){ //method for the lines
        int oddCounter = 1;
        for(int d = 0; d < m; d++){
                System.out.print("-");
            }
            System.out.println();
            oddCounter += 2;
        }
    
    public static void block(int m){ //method to create block using for loops
        int oddCounter = 1;
        System.out.println("Output:");
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < i;j++){
                for(int k = 0; k < oddCounter; k++){
                    System.out.print(i);
                }
                System.out.println();
            }   
            line(oddCounter); //enter oddCounter into line to match dashes with numbers
            oddCounter +=2;
        }
    }

    public static void allBlocks(int m){
        block(m); //run block
    }
    
    public static void main(String[] s) { //main method
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
}
