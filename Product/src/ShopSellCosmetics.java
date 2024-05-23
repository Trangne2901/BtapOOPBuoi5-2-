import java.util.Arrays;
import java.util.Comparator;

public class ShopSellCosmetics {
    Product [] listProduct = new Product[0];

// Them san pham
    public Product [] addNewProduct ( Product newProduct){
        Product [] newListProduct = new Product[listProduct.length +1];
        newListProduct[0] = newProduct;
        System.arraycopy(listProduct,0,newListProduct,1,listProduct.length);
        listProduct = newListProduct;
        return newListProduct;
    }


//    Sap xep

    public void sortProductWithPrice (boolean ascending){
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        if(!ascending ){
            comparator = comparator.reversed();
        }
        Arrays.sort(listProduct, comparator);
    }
//    Tim san pham theo ten


    public Double findPriceProductWithProduct(String keyword){
        for ( Product product : listProduct){
            if (product.getName().equalsIgnoreCase(keyword)){
                return product.getPrice();
            }
        }
        return null;
    }
//    Xoa san pham theo ten
    public boolean removeProductWithProductName(String deleteProductName){
        for (int i=0; i<= listProduct.length;i++){
            if(listProduct[i].getName().equalsIgnoreCase(deleteProductName)){
                Product[] newPhones = new Product[listProduct.length-1];
                System.arraycopy(listProduct,0,newPhones,0,i);
                System.arraycopy(listProduct,i+1,newPhones,i,listProduct.length-i-1);
                listProduct = newPhones;
                return true;
            }
        }
        return false;
    }

//Tong gia tri san pham
    public double caclulateTotalPrice(){
        double totalPrice = 0;
        for ( Product product : listProduct){
            totalPrice += (product.getPrice()*product.getNumber());
        }
        return totalPrice;
    }

    public void displayListProduct(){
        for ( Product product : listProduct){
            System.out.println(product.toString());
        }
    }


}
