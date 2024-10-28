package part6;

public class Tie extends Clothes implements ManClothes{
    Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук " + toString());
    }
}
