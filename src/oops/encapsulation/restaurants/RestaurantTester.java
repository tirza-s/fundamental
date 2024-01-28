package oops.encapsulation.restaurants;

// Controller
public class RestaurantTester {
     public static void main(String[] args) {
          // Create new gourmet restaurant object with specific parameters
          Gourmet fancy = new Gourmet(110, 50, "Italian" , 20);

          //Create new gourmet restaurant using the default constructors
          Gourmet fancyDefault = new Gourmet();

          System.out.println("New fancy " + fancy.getStyle());

     }
}
