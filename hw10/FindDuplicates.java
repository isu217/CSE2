import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int n[]){
    for(int i = 0; i < n.length; i++){
      for(int k = i + 1; k < n.length; k++){
        if(n[i] == n[k]){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean exactlyOneDup(int n[]){
    int dupCount = 0;
    for(int i = 0; i < n.length; i++){
      for(int k = i + 1; k < n.length; k++){
        if(n[i] == n[k]){
          dupCount++;
        }
      }
    }
    if(dupCount > 1 || dupCount == 0){
      return false;
    }
    else{
      return true;
    }
  }
}