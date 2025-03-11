package Tejas.oop.HasARelationship.Lazy;
public class Mobile
{
    String brand;
    String name;
    String color;
    int cam;
    double price;

    Charger c;

    public Mobile()
    {
    }

    public Mobile(String brand, String name, String color, int cam, double price)
    {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.cam = cam;
        this.price = price;
        System.out.println("Mobile is created------");
    }

    public void displayMobile()
    {
        System.out.println("Brand:"+ brand);
        System.out.println("Name: "+name);
        System.out.println("Cam: "+ cam);
        System.out.println("Price: "+ price);
    }

    public void insertCharger(String name, int watt, String type) //Helper method
    {
        c=new Charger(name,type, watt);
        System.out.println("Charger inserted");
    }
}
