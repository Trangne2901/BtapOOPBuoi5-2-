public class Battery {
     private int energy;
    public Battery( int energy){
        this.energy = energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
    public void decreaseEnergy(){
       if (this.energy>0){
           energy--;
       }
    }
}
