package part6.task1;

public abstract class Clothes {
    public Size getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    private Size size;
    private int cost;
    private String color;

    Clothes(Size size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this. color = color;
    }

    @Override
    public String toString(){
        return "Размер: " + size + ", Цена: " + cost + ", Цвет: " + color;
    }


}
