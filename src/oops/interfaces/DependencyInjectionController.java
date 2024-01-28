package oops.interfaces;

import oops.encapsulation.vehicles.Motorcycle;
import oops.inheritance.MotorCycle;
import oops.inheritance.Sedan;
import oops.inheritance.Truck;

public class DependencyInjectionController {

     public static void main(String[] args) {
          Truck truck = new Truck("Ford", "F125", 12000, 500);
          Sedan sedan = new Sedan("Honda", "CRV", 1000, 40);

          MotorCycle motorCycle = new MotorCycle("Ducati", "Monster", 1000,1500, false );

          Dependency example = new Dependency(truck);
          example.testMethod();

          example.setTransport(sedan);
          example.testMethod();

          example.setTransport(motorCycle);
          example.testMethod();

     }
}
