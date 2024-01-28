package arrays;

public class ForEachLoop {

     public static void main(String[] args) {
          int[] nums = new int[7];
          for(int i = 0 ; i < nums.length ; i++){
               nums[i] = i * 7;
          }
          for (int element : nums){
               System.out.print(element + " | ");
          }
     }
}


