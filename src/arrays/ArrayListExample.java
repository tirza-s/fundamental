package arrays;

import java.util.ArrayList;

public class ArrayListExample {
     public static void main(String[] args) {

          // Create a new ArrayList of String
          ArrayList<String> list = new ArrayList<>();
          //add the value to the ArrayList
          list.add("Hello ");
          list.add("World");
          list.add(" !");
          // If the list is not empty
          if(!list.isEmpty()){
               // Iterate over element in the ArrayList and print it
               for (String s : list){
                    System.out.print(s);
               }
          }

     }
}
