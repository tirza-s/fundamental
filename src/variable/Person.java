package variable;

public class Person {

     String name;
     int age;

     // This will create share instance 
     static int numPersonCreated;
     public Person(String name, int age) {
          this.name = name;
          this.age = age;
          numPersonCreated++;
     }

     @Override
     public String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", age=" + age + '\'' +
                  ", numPersonCreated =" + numPersonCreated +
                  '}';
     }
}
