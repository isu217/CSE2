//Ian Udvarhelyi
//hw 11


import java.util.Arrays;


public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   
   public static int[][][] buildMat3d(){ //create build method
       int array[][][] = new int[3][7][11]; //initilize array
        for(int h = 0; h < 1; h++){
          for(int a = 0; a < 3 + (2 * h); a++){
            for(int b = 0; b < h + a + 1; b++){
             array[h][a][b] = (int)(Math.random() * 99);
            } //fill slab 1 array with random numbers up to 99
          }
        }
        for(int h = 1; h < 2; h++){ 
          for(int a = 0; a < 3 + (2 * h); a++){
            for(int b = 0; b < h + a + 1; b++){
             array[h][a][b] = (int)(Math.random() * 99);
            }//fill slab 2 array with random numbers up to 99
          }
        }
        for(int h = 2; h < 3; h++){
          for(int a = 0; a < 3 + (2 * h); a++){
            for(int b = 0; b < h + a + 1; b++){
             array[h][a][b] = (int)(Math.random() * 99);
            }//fill slab 3 with random numbers up to 99
          }
        }
       return array; //return the array
   }
   public static void show(int input[][][]){ //method to print array
     for(int j = 0; j < 3; j++){
       for(int m = 0; m < input[j].length; m++){
         for(int n = 0; n < input[j][m].length; n++){
           if(input[j][m][n] != 0){//the way i created array it has 0s for empty slots
           System.out.print(input[j][m][n]);//so i dont print the members that are 0s
           System.out.print(" ");
           }
         }
         System.out.println();
       }
     }
   }
   public static int findMin(int input[][][]){//find min method
     int min = input[0][0][0];
     for(int i = 0; i < 3; i++){
       for(int k = 0; k < input[i].length; k++){
         for(int j = 0; j < input[i][k].length; j++){
           if(input[i][k][j] < min && input[i][k][j] > 0){//again, way i have it is there are 0s
             min = input[i][k][j];//so create 2 conditions for the member to be a minimum
           }
         }
       }
     }
     return min; //return the min
   }
   public static void sort(int input[][]){ //sort method
     Arrays.sort(input[0]);//sort each row of the 2d array(slab 3)
     Arrays.sort(input[1]);
     Arrays.sort(input[2]);
     Arrays.sort(input[3]);
     Arrays.sort(input[4]);
     Arrays.sort(input[5]);
   }
}
