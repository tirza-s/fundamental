package oops.inheritance;

public class CarContoller {

     public static void main(String[] args) {

          Truck truck = new Truck("Ford", "F125", 12000, 500);
          Sedan sedan = new Sedan("Honda", "CRV", 1000, 40);
          MotorCycle motorCycle = new MotorCycle("Ducati", "Monster", 1000,1500, false );

//          System.out.println(truck.getMake() + " " +  truck.getModel() + " " +  truck.getMiles() + " " + truck.getBedCapacity());
//          truck.accelerate(20);
//
//          System.out.println(sedan.getMake() +" " + sedan.getModel() + " " + sedan.getMiles() + " " + sedan.getTrunkCapacity());
//          sedan.accelerate(10);
//
//          System.out.println(motorCycle.getMake() + " " + motorCycle.getModel() + " " + motorCycle.getMiles() + " " + motorCycle.getCc() + " " + motorCycle.isTwoSet());
//          motorCycle.accelerate(45);

          Scooter motorScott = new Scooter();

          motorCycle.start();
          motorScott.start();

          motorCycle.accelerate(100);
          motorScott.accelerate(75);

     }
}
