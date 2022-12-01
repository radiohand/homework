package additional.videogame;

public class Game {

    /**
     * Запустить игру (бой между двумя юнитами)
     * @param firstUnit первый юнит
     * @param secondUnit второй юнит
     */
    public void playGame (ICombatUnit firstUnit, ICombatUnit secondUnit) {
        while (firstUnit.isAlive() && secondUnit.isAlive()) {
            secondUnit.defend(firstUnit.attack());
            firstUnit.defend(secondUnit.attack());
        }
        if (firstUnit.isAlive()){
            printResult(firstUnit.getName());
        } else {
            printResult(secondUnit.getName());
        }
    }

    /**
     * Вывести в консоль: Победил + переданное название.
     * @param unitName название юнита
     */
    private void printResult (String unitName) {
        System.out.println("Победил " + unitName);
    }
}
