import java.util.ArrayList;

class Student {
    String name;
    int age;
    

    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void details() {
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
    }
}

public class Yashleenkaur981{
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();

      
        students.add(new Student("Yashleen", 21));
        for (Student student : students) {
            student.details();
        }
    }
}
