package variable_scope;

public class MyClass {

     //Everything inside these curly bracket is a member of the class "MyClass"

     public static void main(String[] args) {
          // Everything inside the curly bracket of the main() method belongs to the main() method
          // The variable "I" below is available throughout the main() method)
          int i = 0;
          if (i < 10) {

               // here the variable x is only available within this if statement
               int x = 0;

               while (i < 10) {
                    int z = i + x;
                    // Here the variable z is only available within this while loop
                    System.out.println("the value of z is :" + z);

                    x = x + 1;
                    i = i + 1;
               } // End of while statement
          } // end of if statement

     } // end of main() method
} // end of MyClass
