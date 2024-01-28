package oops.encapsulation.restaurants;

public class Gourmet extends Restaurant {

     private int waitTime;

     // Default constructor
     public Gourmet() {
          // the line below invokes the default (empty) parent contructor
          super();
          waitTime = 0;
     }

     // Constructor
     public Gourmet(int area, int capacity, String style, int wt) {
          // the line below we are invoking the parameterize parent constructor
          super(area, capacity, style);
          waitTime = wt;
     }

     @Override
     public String toString() {
          return "Gourmet{" +
                  "waitTime=" + waitTime +
                  '}';
     }
}
