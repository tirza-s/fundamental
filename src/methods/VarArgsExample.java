package methods;

public class VarArgsExample {

     public static void main(String[] args) {
          int count1 = countArgs("One", "two", "three");
          int count2 = countArgs("One", "two");
          int count3 = countArgs("One");
          System.out.println("Count 1 is " + count1);
          System.out.println("Count 2 is " + count2);
          System.out.println("Count 3 is " + count3);
     }

     public static int countArgs(String...args){
          int count = 0;

          for(String s : args){
               count++;
          }
          return count;
     }
}
