import java.util.ArrayList;
import java.util.List;

class RealWarehouse implements Warehouse {
    @Override
    public List<String> listProducts() {
        List<String> products = new ArrayList<>();
        products.add("Mobile");
        products.add("Iphone");
        products.add("Oppo");
        products.add("Vivo");
        return products;
    }

    @Override
    public String sellProduct(String product)
    {
        List<String>products = listProducts();
        for(String prod : products)
        {
            if(product==prod)
            {
                return prod;
            }
        }
        return "This product is not available";
    }
}