package oops.interfaces;

public class Dependency {
     // Dependency injection
     MotorizedTransport transport;

     public Dependency(MotorizedTransport transport) {
          this.transport = transport;
     }

     public void testMethod(){
          transport.start();
          transport.accelerate(30);
          transport.decelerate(15);
          transport.stop();
          System.out.println("---------------");
     }

     public void setTransport(MotorizedTransport transport) {
          this.transport = transport;
     }
}
