package part6.task2;

public class Book implements Printable{
    public String getName() {
        return name;
    }

    String name;

    Book(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Книга " + getName());
    }

    public static void printBooks(Printable[] printables){
        for (Printable printable: printables){
            if(printable instanceof Book){
                printable.print();
            }
        }
    }
}
