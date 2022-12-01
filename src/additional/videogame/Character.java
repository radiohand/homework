package additional.videogame;

public abstract class Character implements ICombatUnit {

    protected int health;
    protected int damage;
    protected int armour;
    protected String name;

    public int attack () {
        if (isAlive()) return damage;
        return 0;
    }

    public void defend (int damage) {
        if (damage > armour) {
            health -= (damage - armour);
        }
    }

    public boolean isAlive () {
        if (health > 0) {return true;}
        return false;
    }

    public String getName () {
        return name;
    }
}