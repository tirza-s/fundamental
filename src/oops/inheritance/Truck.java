package oops.inheritance;

public class Truck extends Vehicle {

     private double bedCapacity;

     public Truck(String make, String model, double miles, double bedCapacity) {
          super(make, model, miles);
          this.bedCapacity = bedCapacity;
     }

     @Override
     public boolean start() {
          System.out.println("Truck start...");
          return false;
     }

     public double getBedCapacity() {
          return bedCapacity;
     }

     public void setBedCapacity(double bedCapacity) {
          this.bedCapacity = bedCapacity;
     }
}
