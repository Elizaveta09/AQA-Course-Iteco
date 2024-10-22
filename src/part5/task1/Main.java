package part5.task1;

public class Main {
    public static void main (String args[]){
        Person person = new Person();
        Person person1 = new Person("Владимир", 35);

        person1.talk(person1);

        //System.out.println(person1.getFullname());
    }
}
