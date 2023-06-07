import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface VendingMachine {
    public void putProduct(Product item);

    public void putManyProducts(ArrayList<Product> items);

    public Product getProduct();
}
