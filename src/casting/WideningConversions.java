package casting;

public class WideningConversions {
     public static void main(String[] args) {
          int i = 100 ;

          // Convert int "i" to long "l" - no explicit type casting required
          long l = i ;

          // Convert long "l" to float "f" - no explicit type casting required
          float f = l;

          // Convert float "f" to a double "x" - no explicit type casting required
          double x = f;

          System.out.println("Int value = " + i);
          System.out.println("Long value = " + l);
          System.out.println("Float value = " + f);
          System.out.println("Double value = " + x);

     }

}
