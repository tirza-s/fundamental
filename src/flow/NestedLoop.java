package flow;

public class NestedLoop {
     public static void main(String[] args) {
          for (int i = 0; i < 3; i++) {
               System.out.println("Loop = " + i);
               for (int j = 0; j < 3; j++)
                    System.out.println("i + j = " + (i + j));
          }
          System.out.println("-----------");
     }
}
