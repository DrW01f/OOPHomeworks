import java.util.ArrayList;
import java.util.LinkedList;

public class WaterVendingMashine implements VendingMachine {
    
    private LinkedList<Product> waters;

    @Override
    public void putProduct( Product items) {
        this.waters.add(items);
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    @Override
    public void putManyProducts(ArrayList<Product> items) {
         this.waters.addAll(items);
    }
}
