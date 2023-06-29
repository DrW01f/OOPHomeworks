public class Water extends Product {

    @Override
    public String getName() {
        return super.name;
    }

    public Water(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
    }

    Water water = new Water(name, getPrice());

   
    // public int Comparable.compareTo(Water) {        
    //     return this.getPrice()-w.getPrice();
    // }
    
}
