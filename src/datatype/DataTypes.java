package datatype;

public class DataTypes {

     public static void main(String[] args) {

          int length = "hello".length();
          System.out.println(length);

          boolean equals = "hello".equals("hello");
          System.out.println(equals);

          int search = "hello".indexOf("o");
          System.out.println(search);

          int someVariable = 10;

          String str = "Hello " + "the value of someVariable is " + someVariable + "!";
          System.out.println(str);
     }

}
