package flow;
public class WhileLoop {
     public static void main(String[] args) {
          int outerCount = 0;
          int innerCount = 0;

          while(outerCount < 10){

               while (innerCount < 10){
                    System.out.println("Outer count = " + outerCount + " and Inner count = " + innerCount  );
                    innerCount++;
               }

               innerCount = 0;
               outerCount++;
          }
          System.out.println("All done with while loop");
     }
}
