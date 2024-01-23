import java.util.List;

class WarehouseProxy implements Warehouse {
    private RealWarehouse realWarehouse;

    @Override
    public List<String> listProducts() {
        if (realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }

        return realWarehouse.listProducts();
    }

    @Override
    public String sellProduct(String product)
    {
        if(realWarehouse==null) 
        {
            realWarehouse = new RealWarehouse();
        }

        return realWarehouse.sellProduct(product);
    }
}