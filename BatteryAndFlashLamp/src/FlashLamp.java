public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp(boolean status, Battery battery){
        this.status = status;
        this.battery = battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getBattery() {
        battery.decreaseEnergy();
        return battery.getEnergy();
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
    public void light(){
        battery.decreaseEnergy();
        if (status) {
            System.out.println("Light");
        }else {
            System.out.println("No light");
        }

    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
}
