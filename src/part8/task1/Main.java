package part8.task1;

import java.util.List;

public class Main {
    public static void main(String[] args){
//        Задача №1: Дженерик метод (База)
//                Напишите общий методы для подсчета количества элементов в коллекции, обладающих определенным свойством.
//
//        Аргумент дженерик методов - список элементов типа Type, возвращается - количество элементов, которые являются:
//        1) нечетными целыми числами
//        2) простыми числами

        List<Integer> list = List.of(97, 101, 2, 3, 4, 5, 7, 8, 9, 11, 15, 17, 19, 23);

        int count = countOddNumber(list);
        System.out.println("Кол-во нечетных чисел: " + count);

        int count2 = countPrimeNumber(list);
        System.out.println("Кол-во простых чисел: " + count2);
    }

    public static <Type extends Number> int countOddNumber(List<Type> list){
        int count = 0;
        for(Type element: list){
            if (element.intValue() % 2 != 0){
                count++;
            }
        };
        return count;
    }

    // Метод для подсчета количества простых чисел
    public static <Type extends Number> int countPrimeNumber(List<Type> list){
        int count2 = 0;
        for (Type element : list) {
            if (element instanceof Integer) {
                Integer number = (Integer) element;
                if (isPrime(number)) {
                    count2++;
                }
            }
        }
        return count2;
    }

    // Вспомогательный метод для проверки, является ли число простым
    private static boolean isPrime(int number){
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
