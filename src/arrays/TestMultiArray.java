package arrays;

public class TestMultiArray {

     public static void main(String[] args) {

          int[][]numbers = new int[5][7];
          for(int i = 0 ; i < numbers.length ; i++){
               for(int j = 0; j < numbers.length ; j++){
                    numbers[i][j] = (i * j) * 7/3 ;
               }
          }
          for(int[] outer : numbers){
               for (int val : outer){
                    System.out.print(val + " --> ");
               }
               System.out.println();
          }
     }
}
