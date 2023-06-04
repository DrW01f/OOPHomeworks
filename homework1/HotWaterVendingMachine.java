import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HotWaterVendingMachine implements VendingMachine{
    
    /*Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
    перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт 
    соответствующий имени, объёму и температуре*/

    ArrayList<Product> hotDrinksList = new ArrayList();

    @Override
    public String getName(Product product){
        return product.name;
    }

    @Override
    public int getPrice(Product product){
        return product.price;
    }

    @Override
    public void putProduct(Product product){
        hotDrinksList.add(product);        
    }

    @Override
    public void putProductsList(List<Product> manyProduct){
        hotDrinksList.addAll(manyProduct);
    }
    
    @Override
    public Product getProduct(){
        return hotDrinksList.remove(hotDrinksList.size()-1);
    }

    @Override
    public HotDrinks getProduct(String name, int price, int temperature){
        HotDrinks drinks;
            for (int i = 0; i < this.hotDrinksList.size(); i++) {
                if (getName(hotDrinksList.get(i)) == name && getPrice(hotDrinksList.get(i)) == price)
                {
                    
                }
        }
    
    }

  
       
    
      
}
