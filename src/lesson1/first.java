package lesson1;

public class first {
    public static void main(String[] args) {
        //System.out.println("Мы обязательно изучим Java");

//        3.1 Дано: переменная int count, начальное значение можно указать любое.
//
//        Напишите программу, которая выводит на экран count в степени 10, если count является чётным числом,
//        и count в степени 3, если count нечётное.

        int count = 3;
        if(count % 2 == 0){
            System.out.println(Math.pow(count,10));
        }else{
            System.out.println(Math.pow(count,3));
        }

//        3.2 Дано: целочисленное n, начальное значение можно указать любое.
//
//        Найти количество натуральных чисел, не превосходящих n и не делящихся ни на одно из чисел 2, 3, 5.

        int count2 = 10;
        int count3 = 0;
        for(int i=0; i<count2; i++){
            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)){
                count3 ++;
            }
        }
        System.out.println(count3);

//        3.3 Дано: строка str,  начальное значение можно указать любое.
//
//        Напишите программу, которая удаляет в строке все лишние пробелы,
//        то есть серии подряд идущих пробелов заменяет на одиночные пробелы.
//        Крайние пробелы в строке также должны удалиться.

        String a = " привет,   в этой    строке лишние   пробелы.  ";
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        String str;
        int indexOfNewWord = 0;
        String b, c;

        if (a.charAt(0) == ' ') {
            builder.append(a.substring(1));
            b = builder.toString();
            for(int i = 0; i < b.length()-1; i++){
                if (b.charAt(i) == ' ' && b.charAt(i+1) == ' '){
                    builder2.append(b.substring(indexOfNewWord, i));
                    indexOfNewWord = i + 1;
                }
            }
            c = builder2.toString();
            System.out.println(c);
        }

        if (a.charAt(0) != ' ') {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') {
                    builder.append(a.substring(indexOfNewWord, i));
                    indexOfNewWord = i + 1;
                }
            }
            System.out.println(builder.toString());
        }
    }
}
