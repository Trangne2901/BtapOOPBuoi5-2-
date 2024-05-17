public class Apple {
    int weight;

    public Apple(int weight) {
        this.weight = weight;

    }

    public int getWeight(int a) {
        weight = a;
        return weight;
    }
    public  void decrease() {
        if(this.isEmpty()){
            System.out.println("Táo đã hết rồi");
        }else {
            this.weight--;
        }
    }

    public boolean isEmpty() {
        if(this.weight <= 0){
            return true;
        }else {
            return false;
        }
    }
}
