package variable;

public class Variables {

    //Global variable
    static double val = 125.75;
    public static void main(String[] args) {

        Person person = new Person("Tosca", 4);
        Person person1 = new Person("Bob", 2);
        Person person2 = new Person("Scooby", 6);

        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        // double x = multiply(val, val * 2);
    }
    public static double multiply (double a, double b){
        double result = a * b;
        printNum(result);
        return result;
    }
    public static void printNum (double numToPrint){
         System.out.println(numToPrint);
    }

}
