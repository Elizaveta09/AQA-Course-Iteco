package part9.task1;

public class Main {
    public static void main(String[] args) {
        //паттерн singleton

        //нет объекта земли
        Earth earth1 = Earth.getInstance();

        //есть объект земли
        Earth earth2 = Earth.getInstance();

        System.out.println(earth1);
        System.out.println(earth2);
    }
}
