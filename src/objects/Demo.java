package objects;

public class Demo {

     public static void main(String[] args) {
          Oven myOven = new Oven(true, 250, "LG");
          Dishwasher myDishwasher = new Dishwasher(true, "LG", 2);
          Refigerator myRefi = new Refigerator(true, "Samsung" , 150);
          Sink mySink = new Sink(true, "IKEA", "stainless steel" );

          Kitchen myKitchen = new Kitchen(myDishwasher, myOven, myRefi, mySink);

          System.out.println("My kitchen has oven and we bought it from " + myOven.getBrand() + " also has " + mySink.getBasinType() + " sink" +
                  " and also has " + myRefi.getBrand() + " refigerator" );


     }
}
