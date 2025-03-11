package Tejas.Collection.List;

public class Grocery
{
    String name;
    int price;
    String brand;
    int qty;

    public Grocery(String name, int qty, int price, String brand)
    {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.brand = brand;
    }

    public Grocery(String name, int price, int qty)
    {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString()
    {
        return "Grocery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", qty=" + qty +
                '}';
    }
}
