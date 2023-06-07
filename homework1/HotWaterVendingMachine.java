import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HotWaterVendingMachine implements VendingMachine{
    
    /*Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
    перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт 
    соответствующий имени, объёму и температуре*/

    
    LinkedList<Product> productList = new LinkedList<>();
    
   @Override
    public void putProduct(Product product){
        productList.add(product);        
    }

    @Override
    public Product getProduct() {
        if (productList.size() > 1) {  
            return productList.pop();
        }        
        System.out.println("Автомат пуст");
        return null;   
    }

    @Override
    public void putManyProducts(ArrayList<Product> items){
        productList.addAll(items);
    }


    public Product getProduct(String name, int price, int temperature){
        if (productList.size() > 1) {            
            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                if (product.getName().equals(name) && product.getPrice() == price &&((HotDrinks) product).getTemp() == temperature) {
                    return productList.remove(i);
                }
            }
        }
        return null; //     
    }

    public void showProducts(){
        if (productList.size() > 1) {
            System.out.println("В автомате находятся следующие напитки: ");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
        else {System.out.println("Автомат пуст");}
    }

    }

