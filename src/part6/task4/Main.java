package part6.task4;

public class Main {
    public static void main(String[] args){
        Student[] students = {
              new Student("Том", "Френк", "4а", 5.0),
              new Aspirant("Стивен", "Джонс", "1в", 5.0, "Work1"),
              new Student("Алекс", "Стив", "3б", 4.5),
              new Aspirant("Эдвард", "Феликс", "1в", 3.1, "Work2")
        };

        for(Student student: students){
            System.out.println(student.getInfo() + student.getScholarship());
        }
    }
}
