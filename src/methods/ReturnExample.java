package methods;
public class ReturnExample {
     public static void main(String[] args) {
          int a = 2;
          int b = 4;
          // assign the value returned from returnSum() to the variable sum
          int sum = returnSum(a, b);
          // Print out the sum of a and b
          System.out.println("The sum is: " + sum);

           a = 5;
           b = 7;
          printSum(a,b);

          earlyExit();

     }
     // the method below has a return type of int - as shown in the line below
     public static int returnSum (int a, int b){
          return a + b;
     }

     public static void printSum (int a, int b){
          int sum = a + b;
          System.out.println("The printSum is :" + sum);
     }

     public static void earlyExit(){
          for(int i = 0 ; i < 10 ; i++){
               if(i == 4){
                    return;
               }
               System.out.println("i = " + i);
          }
     }

}
