public class Apple {
    int weight;
    boolean isEmpty;

    public Apple(int weight) {
        this.weight = weight;
        this.isEmpty = false;
    }

    public int getWeight() {
        return weight;
    }
    public  void decrease() {
        if (this.isEmpty()) {
            System.out.println("Táo ăn hết r");
        } else {
            this.weight--;
        }
    }

    public boolean isEmpty() {

            return isEmpty;

    }

}
