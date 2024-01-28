package oops.inheritance;

public class Sedan extends Vehicle {

     private double trunkCapacity;

     public Sedan(String make, String model, double miles, double trunkCapacity) {
          super(make,model,miles);
          this.trunkCapacity = trunkCapacity;
     }

     @Override
     public boolean start() {
          System.out.println("Sedan staring");
          return false;
     }

     public double getTrunkCapacity() {
          return trunkCapacity;
     }

     public void setTrunkCapacity(double trunkCapacity) {
          this.trunkCapacity = trunkCapacity;
     }
}
