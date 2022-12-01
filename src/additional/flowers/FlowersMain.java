package additional.flowers;

public class FlowersMain {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(7);

        bouquet.addFlower(new Rose("Yellow", 50, 10));
        bouquet.addFlower(new Tulip("Red", 30, 8));
        bouquet.addFlower(new Chrysanthemum("White", 70, 6));

        if (bouquet.hasSpoiledFlowers()) {
            System.out.println("Есть испорченные цветы");
        } else {
            System.out.println("Пока все цветы живые");
        }
    }
}
