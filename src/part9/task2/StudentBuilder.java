package part9.task2;

public class StudentBuilder {
    private String surname;
    private String name;
    private String birthday;
    private int course;
    private  String cityBirthday;
    private String university;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setCityBirthday(String cityBirthday) {
        this.cityBirthday = cityBirthday;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Student getStudent(){
        return new Student(name, surname, birthday, course, cityBirthday, university);
    }
}
