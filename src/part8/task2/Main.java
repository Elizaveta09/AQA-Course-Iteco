package part8.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.set;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(101, 245, 534, 99);
        System.out.println("До обмена позиций в массиве: " + list);

        exchange(list, 1, 3);

        System.out.println("После обмена позиций в массиве" + list);
    }

    public static <Type> void exchange(List list, int index1, int index2){
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            throw new IndexOutOfBoundsException("Индексы находятся вне диапазона");
        }

        Type a = (Type) list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, a);
    }
}
