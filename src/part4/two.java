package part4;

import java.util.*;

import static java.lang.Math.ceil;

public class two {

    public static void main (String[] args) {

        //median();
        //element();
        queue();
    }

    public static void median(){

        List<Integer> nums1 = Arrays.asList(1,3,5,8,9,11);
        List<Integer> nums2 = Arrays.asList(2,4);

        List<Integer> result = new ArrayList<>();

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.size() && pointer2 < nums2.size()){
            if(nums1.get(pointer1) < nums2.get(pointer2)){
                result.add(nums1.get(pointer1));
                pointer1++;
            }else{
                result.add(nums2.get(pointer2));
                pointer2++;
            }
        }

        if (pointer1 < nums1.size()){
            while (pointer1 < nums1.size()){
                result.add(nums1.get(pointer1));
                pointer1++;
            }
        }

        if (pointer2 < nums2.size()){
            while (pointer2 < nums2.size()){
                result.add(nums2.get(pointer2));
                pointer2++;
            }
        }

        System.out.println(result);

        if (result.size() % 2 != 0){
            int i = result.size() / 2;
            int medianRes1 = result.get(i);
            System.out.println(medianRes1);
        }

        if (result.size() % 2 == 0){
            int i2 = result.size() / 2;
            int median2 = result.get(i2);
            int median3 = result.get(i2-1);
            float medianRes2 = ((float) (median2 + median3)) / 2;
            System.out.println(medianRes2);
        }

    }

    public static void element(){
        List<Integer> elements = Arrays.asList(1,1,4,5,3,1,2,3,4);

        HashMap<String, Integer> hashmap = new HashMap <>();

        for(int i=0; i < elements.size(); i++){
            if (hashmap.containsKey(String.valueOf(elements.get(i)))){
                hashmap.put(String.valueOf(elements.get(i)), hashmap.get(String.valueOf(elements.get(i)))+1);
            }else{
                hashmap.put(String.valueOf(elements.get(i)), 1);
            }
        }

        System.out.println(hashmap);
    }

    public static void queue(){
//        Задача №2: Очередь в банк (Со звёздочкой)
//        В отделении банка работает K окон, в общей очереди стоит N человек, каждому из которых понадобится 10 минут на обслуживание.
//        Вывести всех посететителей, кто подойдет к окнам через M минут от начала смены.
//
//        Пример:
//        Очередь N {Миша, Петя, Катя, |Игорь, Самуил, Ева, |Светлана, Матвей}
//         Мин              10                   20                  30
//        Окно K = 3
//        M = 15 минут
//        Ответ: на 15 минуте у окон будут стоять Игорь, Самуил, Ева

        List<String> queue = new ArrayList<>();
        List<String> resultQueue = new ArrayList<>();

        queue.add("Миша");
        queue.add("Петя");
        queue.add("Катя");
        queue.add("Игорь");
        queue.add("Самуил");
        queue.add("Ева");
        queue.add("Светлана");
        queue.add("Матвей");

        int k = 3;

        int m = 18;

        int y = m / 10 * k; // кол-во клиентов, обслуженных до M минут, в примере 3

        //идем с клиента под индексом 0
        for (int i = 0; i < k; i++){
            int z = i+y; //индекс клиента, который подходит к окну
            if(z < queue.size()){
                resultQueue.add(queue.get(z));
            }
        }

        System.out.println("На " + m + " минуте у окон будут стоять: " + resultQueue);
    }
}
