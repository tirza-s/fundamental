package oops.encapsulation.animals;

public class AnimalTester {
     public static void main(String[] args) {

          //Create object of generic animal, dog and fox
          Animal genericAnimal = new Animal();
          Animal myDog = new Dog();
          Animal myFox = new Fox();

          genericAnimal.makeSound();
          myDog.makeSound();
          myFox.makeSound();
     }
}
