public class SwitchButton {
    private boolean status;
    private ElectricLamp Lamp;

//    public SwitchButton(boolean status, ElectricLamp Lamp) {
//        this.Lamp = Lamp;
//        this.status = status;
//    }



    public void connectElectricLam(ElectricLamp name){
        this.Lamp = name;
    }


    public void switchOff() {
        this.status = false;
        System.out.println( "Đèn :"+ Lamp.getLamp() +"đã tắt");
    }

    public void switchOn() {
        this.status = true;
        System.out.println( "Đèn :"+ Lamp.getLamp() +"đã bật");
    }
}
