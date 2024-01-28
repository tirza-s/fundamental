package arrays;

public class AnotherArrayExample {
     public static void main(String[] args) {

          // instantiate new int array with length 5
          int[]value = new int[5];

          // print out the length of the array
          System.out.println("the length of the arrays : " + value.length);

          // loop through the array
          for(int i = 0 ; i < value.length ; i++){
               // populate each index of the array with the value of "i"
               value[i] = i;
          }
          // for each int in value
          for(int i : value){
               System.out.println(i);
          }

     }
}
