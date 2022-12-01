package additional.flowers;

import java.util.ArrayList;

public class Bouquet {
    private final int age;

    public Bouquet (int age) {
        this.age = age;
    }

    ArrayList <Flower> bouquet = new ArrayList<>();

    /**
     * Добавить цветок в список, представляющий букет
     * @param flower цветок, который необходимо добавить
     */
    public void addFlower (Flower flower) {
        bouquet.add(flower);
    }

    /**
     * Определить, есть ли в букете испорченные цветы.
     * @return true, если есть. false, если нет.
     */
    public boolean hasSpoiledFlowers () {
        for (Flower flower : bouquet) {
            if (age > flower.getBestBefore()) {
                return true;
            }
        }
        return false;
    }
}
