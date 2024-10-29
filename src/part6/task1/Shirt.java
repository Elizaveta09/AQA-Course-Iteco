package part6.task1;

public class Shirt extends Clothes implements ManClothes, WomanClothes{
    Shirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Мужская футболка " + toString());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская футболка " + toString());
    }
}
