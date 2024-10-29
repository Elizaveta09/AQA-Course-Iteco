package part6.task2;

public class Main {
    public static void main(String[] args){
        Printable[] printables = new Printable[3];

        printables[0] = new Book("Красавица и чудовище");
        printables[1] = new Magazine("Summer 2024");
        printables[2] = new Magazine("Style");

//        for (Printable printable: printables){
//            printable.print();
//        }

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
