package part6.task1;

public class Trousers extends Clothes implements ManClothes, WomanClothes {
    Trousers(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские брюки " + toString());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские брюки " + toString());
    }
}
