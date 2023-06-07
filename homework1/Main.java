public class Main {
 /*
 1  Создать наследника реализованного класса ГорячийНапиток с дополнительным полем 
 int температура.
2   Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт 
соответствующий имени, объёму и температуре
3   В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
воспроизвести логику, заложенную в программе
4   Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/


    public static void main(String[] args) {
        HotDrinks coffe = new HotDrinks("coffe", 100, 80);

        System.out.println(coffe);
        Product apple = new Product("apple", 30);
        Product lemon = new Product();

        // Product sea = new Water("White sea", 10);
        // (HotDrinks) sea 
        // System.out.println((HotDrinks));
    }
       
}

// В том и дело, что дальше просят создать  несколько ГорячихНапитков и ГорячихНапитковАвтомат, тогда не понятно зачем 