package part9.task2;

import java.util.Date;

public class Student {
    private String surname;
    private String name;
    private String birthday;
    private int course;
    private  String cityBirthday;
    private String university;

    public Student(String name, String surname, String birthday, int course, String cityBirthday, String university) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.course = course;
        this.cityBirthday = cityBirthday;
        this.university = university;
    }
}
