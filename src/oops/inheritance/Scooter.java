package oops.inheritance;

import oops.interfaces.MotorizedTransport;

public class Scooter implements MotorizedTransport {
     @Override
     public boolean start() {
          System.out.println("start scooter");
          return false;
     }

     @Override
     public void stop() {
          System.out.println("stop scooter");
     }

     @Override
     public void accelerate(int mph) {
          System.out.println("accelerate scooter");
     }

     @Override
     public void decelerate(int mph) {
          System.out.println("decelerate scooter");
     }
}
