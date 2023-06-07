public class HotDrinks extends Water {
   //Наследник от Water с полем температура
    protected Integer temperature;
    
    public HotDrinks(String name, int price, Integer temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemp(){
        return temperature;
    }


    @Override
    public String toString() {
        return "Горячий напиток: " + name + " Стоимость: " + price + " Температура: " + temperature;
    }
    
}
