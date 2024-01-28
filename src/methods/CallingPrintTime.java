package methods;

public class CallingPrintTime {
     public static void main(String[] args) {
          // Different way to call the method
          UnderstandingMethods.printCurrentTime();

          String time = UnderstandingMethods.getCurrentTime();
          System.out.println(time);

     }
}
