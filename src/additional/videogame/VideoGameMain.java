package additional.videogame;

public class VideoGameMain {
    public static void main(String[] args) {

        ICombatUnit unit1 = new Team("BestTeam","Human", "Elf", "Dwarf", "Dwarf");
        ICombatUnit unit2 = new KingOfDarkness();
        ICombatUnit unit3 = new SmaugDragon();

        Game game = new Game();

        game.playGame(unit1, unit2);
        game.playGame(unit1, unit3);
    }
}
