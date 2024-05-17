public class main {
    public static void main(String[] args) {
        ElectricLamp Lamp = new ElectricLamp(false," 1");
        ElectricLamp Lamp1 = new ElectricLamp(false,"2");
        SwitchButton button = new SwitchButton();
        Lamp.turnOff();
        Lamp1.turnOn();
        button.connectElectricLam(Lamp);
        button.switchOn();
    }

}
