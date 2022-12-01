package additional.flowers;

public abstract class Flower implements IFlower {

    protected String color;
    protected int length;
    protected int bestBefore;

    @Override
    public int getBestBefore() {
        return bestBefore;
    }
}
