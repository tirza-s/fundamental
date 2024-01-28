package arrays;
public class IterationExample {
     public static void main(String[] args) {

          int[] values = new int[5];

         for(int i = 0 ; i < values.length ; i++){
              values[i] = i * 2 ;
             System.out.println("the values are : " + values[i]);
          }
     }
}
