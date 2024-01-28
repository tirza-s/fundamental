package arrays;

public class MultiArrays {

     public static void main(String[] args) {
          int [][] values = new int[5][7];
          int count = 0;

          // populate array
          for(int i = 0; i < values.length ; i++){
               for(int j = 0 ; j < values[i].length ; j++){
                    values[i][j] = count;
                    count++;
               }
          }
          for(int i = 0 ; i < values.length ; i++){
               for (int j = 0 ; j < values[i].length ; j++){
                    System.out.print(values[i][j] + " | ");
               }
               System.out.println();
          }
     }
}
