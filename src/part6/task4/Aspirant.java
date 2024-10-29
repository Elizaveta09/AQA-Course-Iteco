package part6.task4;

public class Aspirant extends Student{
    public String getScientificWork() {
        return scientificWork;
    }

    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public String getScholarship(){
        scholarship = (getAverageMark() == 5.0) ? 200 : 180;
        return " Стипендия " + scholarship + " грн";
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " научная работа = " + getScientificWork();
    }
}
