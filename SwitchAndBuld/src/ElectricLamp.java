public class ElectricLamp {
    private boolean status;
    private String name;

    public String getLamp(){
        return this.name;
    }
    public ElectricLamp( boolean status, String name){
        this.status = status;
        this.name = name;
    }

    public void turnOn() {
        this.status = true;
        System.out.println("Đèn :"+ this.name +" bật");
            }

    public void turnOff() {
        this.status = false;
        System.out.println("Đèn :"+ this.name +" tắt");
    }
}
