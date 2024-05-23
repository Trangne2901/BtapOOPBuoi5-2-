import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Pro1 {
    private final String name;
    private final double price;
    private final double quantity;

    public Pro1(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {

        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}

class Store {
    private final List<Pro1> product1List = new ArrayList<>();

    public void addProduct(Pro1 product) {
        product1List.add(product);
    }

    public double findPrice(String name) {
        for (Pro1 product1 : product1List) {
            if (product1.getName().equals(name)) {
                return product1.getPrice();
            }
        }
        return -1;
    }

    public void removeProduct(String name) {
        product1List.removeIf(product1 -> product1.getName().equals(name));
    }

    public void sortProduct1List() {
        product1List.sort(Comparator.comparingDouble(Pro1::getPrice).reversed());
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Pro1 product1 : product1List) {
            totalPrice += product1.getPrice() * product1.getQuantity();
        }
        return totalPrice;
    }

    public List<Pro1> getProduct1List() {
        return product1List;
    }
}

class Main {

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Pro1("Ipad", 1000.0, 100.0));
        store.addProduct(new Pro1("Mi pad", 2000.0, 50.0));
        store.addProduct(new Pro1("Samsung", 1500.0, 300.0));
        System.out.println("Giá của Ipad: " + store.findPrice("Ipad"));
        store.removeProduct("Mi pad");
        store.sortProduct1List();
        System.out.println("Sắp xếp theo giá giảm dần: ");

        for (Pro1 product : store.getProduct1List()) {
            System.out.println(product);
        }

        System.out.println("Tổng giá trị của cửa hàng: " + store.getTotalPrice());
    }
}