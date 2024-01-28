package oops.interfaces;

public interface MotorizedTransport {
     public boolean start();
     public void stop();
     public void accelerate(int mph);
     public void decelerate(int mph);
}
