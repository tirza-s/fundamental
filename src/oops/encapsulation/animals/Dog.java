package oops.encapsulation.animals;

public class Dog extends Animal {

     // access modifiers are the next level of encapsulation
     private String breed;
     private String name;
     private int age;

     public Dog() {
     }

     public Dog(String breed, String name, int age) {
          this.breed = breed;
          this.name = name;
          this.age = age;
     }

     @Override
     public void makeSound() {
          System.out.println("woof woof");
     }

     public String getBreed() {
          return breed;
     }

     public void setBreed(String breed) {
          this.breed = breed;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     @Override
     public String toString() {
          return "Dog{" +
                  "breed='" + breed + '\'' +
                  ", name='" + name + '\'' +
                  ", age=" + age +
                  '}';
     }
}
