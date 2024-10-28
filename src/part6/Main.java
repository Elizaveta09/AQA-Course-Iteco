package part6;

public class Main {
    public static void main(String[] args){
        System.out.println(Size.s.getDescription());

        System.out.println("Размер одежды " + Size.s.getValue() + " соответствует euroSize " + Size.s.getEuroSize());

        WomanClothes shirt = new Shirt(Size.xxs, 2000, "Green");
        WomanClothes skirt = new Skirt(Size.l, 4000, "Black");
        shirt.dressWoman();
        skirt.dressWoman();

        Clothes[] clothes = {
                new Tie(Size.s, 6000, "White"),
                new Trousers(Size.l, 5500, "Black"),
                new Shirt(Size.xxs, 2700, "Pink"),
                new Skirt(Size.xs, 3400, "Brown")
        };

        Atelier atelier = new Atelier();

        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);

    }
}
