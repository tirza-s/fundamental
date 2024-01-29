package oops.static_nonstatic;

public class House {

     int squareFeet;
     String address;
     static int numHouseBuilt;

     public House(int squareFeet, String address) {
          this.squareFeet = squareFeet;
          this.address = address;
          numHouseBuilt++;
     }

     @Override
     public String toString() {
          return "House{" +
                  "squareFeet=" + squareFeet +
                  ", address='" + address + '\'' +
                  ", numHouseBuilt='" + numHouseBuilt + "}";
     }
}
