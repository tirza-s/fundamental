package oops.encapsulation.vehicles;

public class Vehicle {

     private int milesPerGallon;
     private int fuel_capacity;
     private String type;

     public Vehicle() {
     }

     public Vehicle(int milesPerGallon, int fuel_capacity, String type) {
          this.milesPerGallon = milesPerGallon;
          this.fuel_capacity = fuel_capacity;
          this.type = type;
     }

     public int getMilesPerGallon() {
          return milesPerGallon;
     }

     public void setMilesPerGallon(int milesPerGallon) {
          this.milesPerGallon = milesPerGallon;
     }

     public int getFuel_capacity() {
          return fuel_capacity;
     }

     public void setFuel_capacity(int fuel_capacity) {
          this.fuel_capacity = fuel_capacity;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     // method
     public void start(){
          System.out.println("Vehicle is starting");
     }

     @Override
     public String toString() {
          return "Vehicle{" +
                  "milesPerGallon=" + milesPerGallon +
                  ", fuel_capacity=" + fuel_capacity +
                  ", type='" + type + '\'' +
                  '}';
     }
}
