public class Main3 {
    public static void main(String[] args) {
        Product kcn = new Product("Anessa", 111.9, 10);
        Product daugoidau = new Product("Biotin&Collagen", 399, 4);
        Product nuochoa = new Product("Chanel", 2901.1, 5);
        Product son = new Product("Dior", 1590.0, 7);

        ShopSellCosmetics shopSellCosmtics = new ShopSellCosmetics();

//        Them san pham
        System.out.println("San pham : ");
        shopSellCosmtics.addNewProduct(kcn);
        shopSellCosmtics.addNewProduct(daugoidau);
        shopSellCosmtics.addNewProduct(nuochoa);
        shopSellCosmtics.addNewProduct(son);
        shopSellCosmtics.displayListProduct();
        System.out.println("\n");

//        sap xep
        shopSellCosmtics.sortProductWithPrice( true);
        shopSellCosmtics.displayListProduct();
        System.out.println("\n");

//Tim gia  theo ten
        System.out.println("Gia cua san pham nuoc hoa Chanel la: " + shopSellCosmtics.findPriceProductWithProduct("Chanel") + "\n");

//        Xoa san pham
        System.out.println("Da xoa san pham thanh cong,  Danh sach moi la: " );
        shopSellCosmtics.removeProductWithProductName("Biotin&Collagen");
        shopSellCosmtics.displayListProduct();
        System.out.println("\n");





//        Tong gia tri
        System.out.println("Tong gia tri san pham trong shop la: " + shopSellCosmtics.caclulateTotalPrice() + "\n");


    }
}
