package part6.task4;

public class Student {
    private String firstName;

    public double getAverageMark() {
        return averageMark;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private String lastName;
    private String group;

    private double averageMark;

    int scholarship;

    public String getScholarship(){
        scholarship = (averageMark == 5.0) ? 100 : 80;
        return " Стипендия " + scholarship + " грн";
    };

    Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getInfo(){
        return "Студент: имя = " + getFirstName() + " фамилия = " + getLastName() +
                " группа = " + getGroup() + " средняя оценка = " + getAverageMark();
    }
}
