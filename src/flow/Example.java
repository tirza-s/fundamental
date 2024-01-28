package flow;

public class Example {
     public static void main(String[] args) {
          // Flow control
          // Continue, break, return
          int j = 0;
          for (int i = 0; i < 10; i++) {
               for (j = 0; j < 10; j++)
                    if (i == 3 || j == 7) {
                         // Forces an early iteration of the loop
                         continue;
                    }
               System.out.println("i = " + i);
          }
        //  System.out.println("j =" + j);
     }

}
