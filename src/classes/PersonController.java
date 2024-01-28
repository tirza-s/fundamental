package classes;

public class PersonController {

     public static void main(String[] args) {
          Person somePerson = new Person();
          Person someOtherPerson = new Person();

          somePerson.age = 33;
          somePerson.height = 164;
          somePerson.name = "Tosca";

          someOtherPerson.age = 35;
          someOtherPerson.height = 171;
          someOtherPerson.name = "Bash";

          System.out.println("The first person name is: " + somePerson.name + " " + somePerson.height + " " + somePerson.name);
          System.out.println("The second person name is: " + someOtherPerson.name + " " + someOtherPerson.height + " " + someOtherPerson.name);
     }
}
