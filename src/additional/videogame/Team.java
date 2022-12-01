package additional.videogame;

public class Team implements ICombatUnit {

    private String name;
    private ICombatUnit[] team = new ICombatUnit[4];

    public Team(String name, String ch1, String ch2, String ch3, String ch4) {

        this.name = name;

        String[] team = {ch1, ch2, ch3, ch4};

        for (int i = 0; i < team.length; i++) {
            if (team[i].equalsIgnoreCase("Human")) {
                this.team[i] = new Human();
                continue;
            }
            if (team[i].equalsIgnoreCase("Elf")) {
                this.team[i] = new Elf();
                continue;
            }
            if (team[i].equalsIgnoreCase("Orc")) {
                this.team[i] = new Orc();
                continue;
            }
            if (team[i].equalsIgnoreCase("Dwarf")) {
                this.team[i] = new Dwarf();
            }
        }
    }

    @Override
    public int attack() {

        int damage = 0;

        for (ICombatUnit ch : team) {
                damage += ch.attack();
        }
        return damage;
    }

    @Override
    public void defend(int damage) {
        for (ICombatUnit ch : team) {
            ch.defend(damage);
        }
    }

    @Override
    public boolean isAlive() {
        for (ICombatUnit ch : team) {
            if (!ch.isAlive()) return false;
        }
        return true;
    }

    @Override
    public String getName () {
        return name;
    }
}
