package Tejas.oop.HasARelationship.Early;

public class Pen
{
    String name;
    String brand;
    double price;

    Refil r1=new Refil("Black", 0.5,"Ball","Cello", 10);

    Pen()
    {
    }

    Pen(String name, String brand, double price)
    {
        this.name=name;
        this.price=price;
        this.brand=brand;
        System.out.println("Pen loaded");
    }

    public void displayPen()
    {
        System.out.println(name);
        System.out.println(brand);
        System.out.println(price);
    }
}
