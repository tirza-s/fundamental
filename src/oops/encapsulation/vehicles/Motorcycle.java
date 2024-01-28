package oops.encapsulation.vehicles;

public class Motorcycle extends Vehicle {
     Motorcycle(){
          setMilesPerGallon(30);
          setFuel_capacity(10);
          setType("Motorcycle");
     }

     @Override
     public void start(){
          System.out.println("Motorcycle is starting");
          System.out.println("etc");
     }
}
