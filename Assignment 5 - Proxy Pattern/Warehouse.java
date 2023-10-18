import java.util.List;

public interface Warehouse {
    List<String> listProducts();
    String sellProduct(String product);
}