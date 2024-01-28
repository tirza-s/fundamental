package variable_scope;

public class VariableScope {

     static int globalVar = 10;

     public static void main(String[] args) {
          Vehicle myCar = new Vehicle();
          myCar.make = "Mini Cooper";
          myCar.model = "Countryman";
          myCar.year = 2020;
          System.out.println(myCar);

          if (myCar.make.equalsIgnoreCase("bmw")){
               String message= "It's a BMW";
               System.out.println(message);
          }
     }

     public static int multiple(int a, int b){
          int result = a * b * globalVar;
          return result;
     }

     public static int divide(int a, int b){
          int val = a / b / globalVar;
          return val;
     }
}
