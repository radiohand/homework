package additional.videogame;

public interface ICombatUnit {
    /**
     * Вернуть наносимый юнитом при атаке урон
     * @return урон
     */
    int attack ();

    /**
     * Изменить здоровье юнита в соответствии с нанесенным уроном
     * @param damage полученный урон
     */
    void defend (int damage);

    /**
     * Определить, жив юнит, или нет
     * @return true, если жив, иначе false
     */
    boolean isAlive ();

    /**
     * Получить название юнита
     * @return название
     */
    String getName();
}
