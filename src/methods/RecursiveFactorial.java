package methods;

public class RecursiveFactorial {

     public static void main(String[] args) {

          int x = factorial(5);
          System.out.println(x);
     }

     // 1 * 2 * 3 * 4 * 5 = 120 
     static int factorial(int x){
          int total;

          // base case - this will be used to end the recursive calls
          if(x == 1)
               return 1;

          // otherwise , factorial is called and passed x - 1
          // reducing x each time till it reaches 1.
               total = x * factorial(x - 1);
               return total;
          }

}
