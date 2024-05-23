public class Product {
    private int number;
    private double price;
    private  String name;
    public Product (){

    }
    public Product(String name, double price, int number){
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
