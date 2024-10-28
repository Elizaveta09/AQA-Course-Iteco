package part6;

public class Atelier{
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for(Clothes item: clothes){
            if (item instanceof ManClothes){
                ((ManClothes) item).dressMan();
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for(Clothes item: clothes){
            if (item instanceof WomanClothes){
                ((WomanClothes) item).dressWoman();
            }
        }
    }
}
