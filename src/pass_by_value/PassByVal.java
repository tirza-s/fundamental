package pass_by_value;
public class PassByVal {

     public static void main(String[] args) {
          double a = 12;
          double b = 7;

          System.out.println("before " + a);
          System.out.println("before " + b);

          someOtherMethod(a, b);

          System.out.println("before " + a);
          System.out.println("before " + b);
     }

     public static void someOtherMethod(double a, double b){
          a = a * 10;
          System.out.println("value of a is " + a);
          b = b * 15;
          System.out.println("value of b is " + b);
     }
}
