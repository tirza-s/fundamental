package oops.static_nonstatic;

public class StaticController {
     public static void main(String[] args) {
          House house1 = new House(121, "123, Baker street");
          House house2 = new House(150, "17, Adam land");
          House house3 = new House(251, "72, turtle land");

//          System.out.println(house1.toString());
//          System.out.println(house2.toString());
//          System.out.println(house3.toString());

          System.out.println(house1.numHouseBuilt);
          System.out.println(house2.numHouseBuilt);
          System.out.println(house3.numHouseBuilt);

          House house4 = new House(2000,  "1, King land");

          System.out.println(house1.numHouseBuilt);
          System.out.println(house2.numHouseBuilt);
          System.out.println(house3.numHouseBuilt);
          System.out.println(house4.numHouseBuilt);
     }

}
