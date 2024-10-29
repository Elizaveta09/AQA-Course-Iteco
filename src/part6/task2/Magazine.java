package part6.task2;

public class Magazine implements Printable{
    public String getName() {
        return name;
    }

    String name;

    Magazine(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + getName());
    }

    public static void printMagazines(Printable[] printables){
        for(Printable printable:printables){
            if(printable instanceof Magazine){
                printable.print();
            }
        }
    }
}
