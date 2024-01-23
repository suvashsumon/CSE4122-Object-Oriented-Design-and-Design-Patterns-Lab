import java.util.List;

public class OnlineRetailerShop {
    public static void main(String[] args) {
        Warehouse warehouse = new WarehouseProxy();

        List<String> products = warehouse.listProducts();

        System.out.println("Products available in the online retail store:");
        for (String product : products) {
            System .out.println(product);
        }

        System.out.println("Selling : "+warehouse.sellProduct("Motorola"));
        System.out.println("Selling : " + warehouse.sellProduct("Iphone"));
    }
}