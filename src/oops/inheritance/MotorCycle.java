package oops.inheritance;

public class MotorCycle extends Vehicle {

     private int cc;
     private boolean twoSet;

     public MotorCycle(String make, String model, double miles, int cc, boolean twoSet) {
          super(make, model, miles);
          this.cc = cc;
          this.twoSet = twoSet;
     }

     public void demonstrateThisSuper(){
          this.accelerate(65);
          super.accelerate(150);
     }

     @Override
     public boolean start() {
          System.out.println("Motorcycle start...");
          return false;
     }

     @Override
     public void accelerate(double mph) {
          System.out.println("Motorcycle accelerating..");
     }

     public int getCc() {
          return cc;
     }

     public void setCc(int cc) {
          this.cc = cc;
     }

     public boolean isTwoSet() {
          return twoSet;
     }

     public void setTwoSet(boolean twoSet) {
          this.twoSet = twoSet;
     }


}
