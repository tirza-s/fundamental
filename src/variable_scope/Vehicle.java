package variable_scope;

public class Vehicle {

     public String make;
     public String model;
     public int year;

     public void someMethod(){
          String color;
     }

     @Override
     public String toString() {
          return "Vehicle{" +
                  "make='" + make + '\'' +
                  ", model='" + model + '\'' +
                  ", year=" + year +
                  '}';
     }
}
