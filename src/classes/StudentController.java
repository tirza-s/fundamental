package classes;

public class StudentController {
     public static void main(String[] args) {
          Student student1 = new Student();
          Student student2 = new Student();

          student1.name = "Tosca";
          student1.age = 11;
          student1.course = "Math";

          student2.name = "Bob";
          student2.age = 7;
          student2.course = "Biology";

          System.out.println("The first student is : " + student1.name + " "  + student1.age + " " +  student1.course);

          System.out.println("The second student is : " + student2.name + " " + student2.age + " "  + student2.course);
     }
}
