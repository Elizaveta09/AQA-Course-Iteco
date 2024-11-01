package part9.task2;

public class Main {
    public static void main(String[] args) {
        //смотреть в дебаге
        StudentBuilder studentBuilder1 = new StudentBuilder();
        studentBuilder1.setName("Самуил");
        studentBuilder1.setSurname("Афанасьев");

        Student student1 = studentBuilder1.getStudent();

        StudentBuilder studentBuilder2 = new StudentBuilder();
        studentBuilder2.setUniversity("ЯГТУ");

        Student student2 = studentBuilder2.getStudent();
    }
}
