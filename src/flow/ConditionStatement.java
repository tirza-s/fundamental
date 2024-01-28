package flow;
public class ConditionStatement {

     public static void main(String[] args) {

               boolean val1 = false;
               boolean val2 = true;
               if (val1) {
                    System.out.println("one");
               } else if (val2) {
                    System.out.println("two");
               } else {
                    System.out.println("three");
               }
               if (val1 && val2) {
                    System.out.println("four");
               } else if (val1 || val2) {
                    System.out.println("five");
               } else if (val1 ^ val2) {
                    System.out.println("six");
               } else {
                    System.out.println("seven");
               }
          }
     }

