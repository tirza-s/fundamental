package oops.encapsulation.restaurants;

public class Restaurant {
     private int area;
     private int capacity;
     private String style;

     public Restaurant() {
          area = 0;
          capacity = 0;
          style = "";
     }

     public Restaurant(int area, int capacity, String style) {
          this.area = area;
          this.capacity = capacity;
          this.style = style;
     }

     public int getArea() {
          return area;
     }

     public void setArea(int area) {
          this.area = area;
     }

     public int getCapacity() {
          return capacity;
     }

     public void setCapacity(int capacity) {
          this.capacity = capacity;
     }

     public String getStyle() {
          return style;
     }

     public void setStyle(String style) {
          this.style = style;
     }

     @Override
     public String toString() {
          return "Restaurant{" +
                  "area=" + area +
                  ", capacity=" + capacity +
                  ", style='" + style + '\'' +
                  '}';
     }
}
