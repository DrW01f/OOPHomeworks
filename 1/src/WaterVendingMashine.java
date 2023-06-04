import java.util.LinkedList;

public class WaterVendingMashine implements VendingMachine {
    private LinkedList<Product> waters;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }
}
