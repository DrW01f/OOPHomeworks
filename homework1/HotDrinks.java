public class HotDrinks extends Water {
    /*1 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем 
    int температура.
    2 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и 
    реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
    выдающий продукт соответствующий имени, объёму и температуре
3 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
воспроизвести логику, заложенную в программе
4 Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/
    

    protected Integer temperature;
    
    public HotDrinks(String name, int price, Integer temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток: " + name + " Стоимость: " + price + " Температура: " + temperature;
    }
    
}
