package part6;

public class Skirt extends Clothes implements WomanClothes{
    Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка " + toString());
    }
}
