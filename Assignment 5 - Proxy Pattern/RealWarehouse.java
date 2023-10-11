import java.util.ArrayList;
import java.util.List;

class RealWarehouse implements Warehouse {
    @Override
    public List<String> listProducts() {
        System.out.println("Listing products from the real warehouse...");
        List<String> products = new ArrayList<>();
        products.add("Mobile");
        products.add("Iphone");
        products.add("Oppo");
        products.add("Vivo");
        return products;
    }
}