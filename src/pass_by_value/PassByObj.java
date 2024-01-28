package pass_by_value;

import classes.Person;

public class PassByObj {

     public static void main(String[] args) {
          Person tosca = new Person(5, 160, "Tosca");
          System.out.println(tosca);
          addYearToPerson(tosca);
          System.out.println(tosca.toString());
     }

     public static void addYearToPerson(Person person){
          person.age = person.age + 1;

     }
}
