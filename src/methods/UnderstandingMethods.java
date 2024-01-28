package methods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class UnderstandingMethods {
     public static void main(String[] args) {

          // Different way to call the method
          String time = getCurrentTime();
          System.out.println("The current time is : " + time);

          System.out.println("First we are here");
          printCurrentTime();
          System.out.println("Now we are finishing up");
     }

     public static String getCurrentTime() {
          String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
          return time;
     }

     public static void printCurrentTime() {
          System.out.println("Now we are here, printing time");
          String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
          System.out.println("The current time is : " + time);
     }
}
