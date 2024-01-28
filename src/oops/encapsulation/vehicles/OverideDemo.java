package oops.encapsulation.vehicles;

public class OverideDemo {
     public static void main(String[] args) {

          Vehicle vehicle = new Vehicle();

          Vehicle moto = new Motorcycle();

          moto.start();

          vehicle.start();
     }
}
