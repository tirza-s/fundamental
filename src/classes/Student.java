package classes;

public class Student {
     public String name;
     public int age;
     public String course;

     public Student() {
     }

     public Student(String name, int age, String course) {
          this.name = name;
          this.age = age;
          this.course = course;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  ", course='" + course + '\'' +
                  '}';
     }
}
