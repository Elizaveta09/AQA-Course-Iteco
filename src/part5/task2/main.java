package part5.task2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        ArrayList<Buyer> buyerArrayList = new ArrayList<>();
        buyerArrayList.add(new Buyer("Иванов", "Сергей", "Евгеньевич", "г. Ярославль, ул. Победы, д.7", "123456", 98765));
        buyerArrayList.add(new Buyer("Серов", "Никита", "Валерьевич", "г. Кострома, ул. Советская, д.5", "872341", 186390));
        buyerArrayList.add(new Buyer("Сальвадоровна", "Елена", "Семеновна", "г. Москва, ул. Мира, д.11", "507342", 456456));
        buyerArrayList.add(new Buyer("Макаров", "Воланд", "Евгеньевич", "г. Кострома, ул. Волжская, д. 24", "543819", 298456));
        buyerArrayList.add(new Buyer("Морозова", "Нина", "Андреевна", "г. Ярославль, ул. Трифонова, д.41", "294567", 109431));

//        Задача №2: Класс покупатель (База)
//        Создать класс покупатель с полями: фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Создать список из 5 покупателей (в main).
//        Вывести:
//        Имя покупателя с самой длинной фамилией
//        Адреса всех покупателей, у кого первая цифра номера кредитки 5.
//        Всех покупателей с отчеством "Евгеньевич"

        Buyer buyerLongSurname = null;
        for (Buyer buyer: buyerArrayList){
            if (buyerLongSurname == null || buyer.getSurname().length() > buyerLongSurname.getSurname().length()){
                buyerLongSurname = buyer;
            }
        }
        System.out.println("Имя покупателя с самой длинной фамилией: " + buyerLongSurname.getName());

        System.out.println("Адреса всех покупателей, у кого первая цифра номера кредитки 5: ");
        for (Buyer buyer: buyerArrayList){
            if(buyer.getCreditCard().startsWith("5")){
                System.out.println(buyer.getAddress());
            }
        }
        System.out.println("Покупатели с отчеством Евгеньевич: ");
        for (Buyer buyer: buyerArrayList){
            if (buyer.getPatronymic().equals("Евгеньевич")){
                System.out.println(buyer.getSurname() + " " + buyer.getName());
            }
        }
    }
}
