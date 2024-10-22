package part5.task1;

public class Person {
    private String fullname;
    private int age;

    public int getAge() {
        return this.age;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void talk(Person person){
        System.out.println(fullname + " говорит");
    }

    public Person(String fullname, int age){
        this.fullname = fullname;
        this.age = age;
    }

    public Person(){}

}
