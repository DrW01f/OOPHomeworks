import java.util.ArrayList;

public interface VendingMachine {
    public void putProduct(Product item);

    public void putManyProducts(ArrayList<Product> items);

    public Product getProduct();
}
