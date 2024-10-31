package part8.task3;

public class Main {
    public static void main(String[] args){
        division(55, 0);
    }

    public static void division(int a, int b){
        try {
            int res = a / b;
            System.out.println(res);
        } catch (ArithmeticException n){
            System.out.println("Делить на 0 нельзя");
        }
    }
}
