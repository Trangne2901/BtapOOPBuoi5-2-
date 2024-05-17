public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery(50);
        FlashLamp flashLamp1 = new FlashLamp(true, battery1);
        flashLamp1.getBattery();
        flashLamp1.setBattery(battery1);
        flashLamp1.turnOn();
//        flashLamp1.turnOff();
        flashLamp1.light();

        Battery battery2 = new Battery(10);
        FlashLamp flashLamp2 = new FlashLamp(true, battery2);
        flashLamp2.getBattery();
        flashLamp2.setBattery(battery2);
//        flashLamp2.turnOn();
        flashLamp2.turnOff();
        flashLamp2.light();
    }
}