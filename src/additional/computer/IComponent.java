package additional.computer;

public interface IComponent {

    /**
     * Произвести настройку компонента
     */
    void configComponent ();

    /**
     * Определить, настроен компонент, или нет
     * @return true, если настроен, иначе - false
     */
    boolean isConfigured ();
}
