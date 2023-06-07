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
        HotDrinks coffe = new HotDrinks("кофе", 100, 75);
        HotDrinks blackTea = new HotDrinks("черный чай", 50, 80);
        HotDrinks irishCoffe = new HotDrinks("ирландский кофе", 250, 40);
        HotDrinks greenTea = new HotDrinks("зеленый чай", 55, 65);
        HotDrinks mulledWine = new HotDrinks("глинтвейн", 200, 85);
        HotDrinks blackTeaLemon = new HotDrinks("черный чай с лимоном", 60, 80);
        HotDrinks colaWhiski = new HotDrinks("виски с колой", 180, 40);


        HotWaterVendingMachine coffeMachine = new HotWaterVendingMachine();
        HotWaterVendingMachine alcoholMachine = new HotWaterVendingMachine();
        // System.out.println(coffe);
        coffeMachine.showProducts();

        coffeMachine.putProduct(coffe);
        coffeMachine.putProduct(blackTea);
        coffeMachine.putProduct(greenTea);
        coffeMachine.putProduct(blackTeaLemon);

        coffeMachine.showProducts();
        System.out.println("-------------");
        System.out.println(coffeMachine.getProduct());
        System.out.println("-------------");
        System.out.println(coffeMachine.getProduct());
        System.out.println(coffeMachine.getProduct());
        System.out.println(coffeMachine.getProduct());
        System.out.println("-------------");
        coffeMachine.showProducts();
        System.out.println("-------------");
        alcoholMachine.showProducts();
        System.out.println("-------------");

        coffeMachine.getProduct("зеленый чай",10, 40);
        coffeMachine.getProduct("зеленый чай",55, 65);


        alcoholMachine.putProduct(irishCoffe);
        alcoholMachine.putProduct(mulledWine);
        alcoholMachine.putProduct(colaWhiski);

        alcoholMachine.showProducts();



    }
       
}
