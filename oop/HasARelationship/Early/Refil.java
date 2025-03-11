package Tejas.oop.HasARelationship.Early;

public class Refil
{
    String color;
    double mm;
    String type;
    String brand;
    double price;

    public Refil(String color, double mm, String type, String brand, double price)
    {
        this.color = color;
        this.mm = mm;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public void displayRefil()
    {
        System.out.println(color);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(type);
        System.out.println(mm);
    }
}
