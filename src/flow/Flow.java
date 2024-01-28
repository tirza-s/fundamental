package flow;

public class Flow {
     public static void main(String[] args) {
        int i = 10;

        if(i > 0){
             System.out.println("Lorem");
             // Ipsum didn't print because the condition i > 10 is false
             if(i > 10){
                  System.out.println("Ipsum");
             }if(i > 5){
                  System.out.println("Dolor");
             }
             System.out.println("Sit");
        }if(i >= 10){
               System.out.println("Amet");
          }
          System.out.println("Consectetur");
     }
}
