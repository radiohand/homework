package additional.computer;

public class Computer {
    private IComponent cpu;
    private IComponent graphicCard;
    private IComponent powerUnit;
    private IComponent ram;
    private IComponent hdd;

    private final StringBuilder report = new StringBuilder();

    /**
     * Установить в компьютер процессор
     * @param cpu процессор
     */
    public void setCpu(IComponent cpu) {
        if (cpu instanceof CPU) this.cpu = cpu;
    }

    /**
     * Установить в компьютер видеокарту
     * @param graphicCard видеокарта
     */
    public void setGraphicCard(IComponent graphicCard) {
        if (graphicCard instanceof GraphicCard) this.graphicCard = graphicCard;
    }

    /**
     * Установить в компьютер блок питания
     * @param powerUnit блок питания
     */
    public void setPowerUnit(IComponent powerUnit) {
        if (powerUnit instanceof PowerUnit) this.powerUnit = powerUnit;
    }

    /**
     * Установить в компьютер оперативную память
     * @param ram оперативная память
     */
    public void setRam(IComponent ram) {
        if (ram instanceof RAM) this.ram = ram;
    }

    /**
     * Установить в компьютер жесткий диск
     * @param hdd жесткий диск
     */
    public void setHdd(IComponent hdd) {
        if (hdd instanceof HDD) this.hdd = hdd;
    }

    /**
     * Включить компьютер
     */
    public void turnOn () {
        checkComponents();
    }

    /**
     * Проверить, и записать в отчет: все ли компоненты установлены
     */
    public void checkComponents () {
        addToReport("Power unit", powerUnit != null);
        addToReport("CPU", cpu != null);
        addToReport("Graphic card", graphicCard != null);
        addToReport("RAM", ram != null);
        addToReport("HDD", hdd != null);
    }

    /**
     * Добавить запись в отчет
     * @param componentName название компонента
     * @param isInstalled установлен компонент, или нет
     */
    private void addToReport (String componentName, boolean isInstalled) {
        if (report.length() == 0) {
            report.append("Start report: \n");
        }
        report.append(componentName).append(" ");
        if (isInstalled) {
            report.append("is installed");
        } else {report.append("is missing");}
        report.append("\n");
    }

    /**
     * Получить отчет
     * @return отчет
     */
    public String getReport () {
        return report.toString();
    }
}