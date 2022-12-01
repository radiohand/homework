package additional.computer;

public class ComputerMain {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu(new CPU());
        computer.setPowerUnit(new PowerUnit());
        computer.setGraphicCard(new GraphicCard());
        computer.setHdd(new HDD());
        computer.setRam(new RAM());

        computer.turnOn();

        System.out.println(computer.getReport());
    }
}
