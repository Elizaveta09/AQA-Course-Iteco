package part3;

public class first {
    public static void main(String[] args) {
        //System.out.println("Мы обязательно изучим Java");

//        3.1 Дано: переменная int count, начальное значение можно указать любое.
//
//        Напишите программу, которая выводит на экран count в степени 10, если count является чётным числом,
//        и count в степени 3, если count нечётное.

//        int count = 3;
//        if(count % 2 == 0){
//            System.out.println(Math.pow(count,10));
//        }else{
//            System.out.println(Math.pow(count,3));
//        }

//        3.2 Дано: целочисленное n, начальное значение можно указать любое.
//
//        Найти количество натуральных чисел, не превосходящих n и не делящихся ни на одно из чисел 2, 3, 5.

//        int count2 = 10;
//        int count3 = 0;
//        for(int i=0; i<count2; i++){
//            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)){
//                count3 ++;
//            }
//        }
//        System.out.println(count3);

//        3.3 Дано: строка str,  начальное значение можно указать любое.
//
//        Напишите программу, которая удаляет в строке все лишние пробелы,
//        то есть серии подряд идущих пробелов заменяет на одиночные пробелы.
//        Крайние пробелы в строке также должны удалиться.

//        String a = " привет,   в этой    строке лишние   пробелы.  ";
//        StringBuilder builder = new StringBuilder();
//        StringBuilder builder2 = new StringBuilder();
//        String str;
//        int indexOfNewWord = 0;
//        String b, c;
//
//        if (a.charAt(0) == ' ') {
//            builder.append(a.substring(1));
//            b = builder.toString();
//            for(int i = 0; i < b.length()-1; i++){
//                if (b.charAt(i) == ' ' && b.charAt(i+1) == ' '){
//                    builder2.append(b.substring(indexOfNewWord, i));
//                    indexOfNewWord = i + 1;
//                }
//            }
//            c = builder2.toString();
//            System.out.println(c);
//        }
//
//        if (a.charAt(0) != ' ') {
//            for (int i = 0; i < a.length() - 1; i++) {
//                if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') {
//                    builder.append(a.substring(indexOfNewWord, i));
//                    indexOfNewWord = i + 1;
//                }
//            }
//            System.out.println(builder.toString());
//        }


//        3.4 Дано: целочисленное число n, начальное значение может быть любое.
//        Напишите программу, которая определяет: (можно сделать не все варианты, а выбрать понравившийся)
//        а) количество цифр в нем;
//        int n = 45237;
//        String z = Integer.toString(n);
//        int countN = 0;
//        for(int i =0; i< z.length(); i++) {
//            countN++;
//        }
//        System.out.println(countN);

//        б) сумму его цифр;
//        int sum = 0;
//        for(int i =0; i< z.length(); i++) {
//            sum = sum + n%10;
//            n = n/10;
//        }
//        System.out.println(sum);

//        в) произведение его цифр;
//        int pro = 1;
//        for(int i =0; i< z.length()-1; i++) {
//            pro = pro * (n%10);
//            n = n/10;
//        }
//        System.out.println(pro);

//        г) среднее арифметическое его цифр;
//        int srArif = sum/countN;
//        System.out.println(srArif);

//        д) сумму квадратов его цифр; НЕ СДЕЛАЛА
//        int sum2 = 0;
//        for(int i =0; i< z.length(); i++) {
//            int d = n % 2;
//            sum2 = sum2 + Math.pow(d);
//            n = n/10;
//        }
//        System.out.println(sum2);

//        е) сумму кубов его цифр;
//        double sum3 = 0;
//        for(int i =0; i< z.length(); i++) {
//            sum3 = sum3 + ((n % 10)*(n % 10)*(n % 10));
//            n = n/10;
//        }
//        System.out.println(sum3);

//        ж) его первую цифру;
//        for(int i =0; i< z.length()-1; i++) {
//            n = n / 10;
//        }
//        System.out.println(n);

//        з) сумму его первой и последней цифр.
//        int a = n;
//        int b = n%10;
//        for (int i = 0; i < z.length()-1; i++){
//            a = a / 10;
//        }
//        int sumFirstLast = a + b;
//        System.out.println(sumFirstLast);

//        3.5 Дано: строка str, начальное значение может быть любое.
//        Напишите программу, считающую количество цифр 1, 2, 3 в строке.
//        Пример: str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина"
//        Кол-во 1: 2
//        Кол-во 2: 1
//        Кол-во 3: 0

        String str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина";
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i =0; i< str.length(); i++) {
            if (str.charAt(i) == '1') {
                a++;
            } else if (str.charAt(i) == '2') {
                b++;
            } else if (str.charAt(i) == '3'){
                c++;
            }
        }
        System.out.println("Кол-во 1: " + a);
        System.out.println("Кол-во 2: " + b);
        System.out.println("Кол-во 3: " + c);
    }
}
