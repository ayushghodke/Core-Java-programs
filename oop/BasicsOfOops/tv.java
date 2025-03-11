package Tejas.oop.BasicsOfOops;

public class tv
{
    String brand="lg";
    String screen;
    double price;
    double size;
    String color;

    {
        System.out.println("tv is getting lodaed");
    }
    tv()
    {

    }

    tv(double price,double size, String color)
    {
        this.price=price;
        this.size=size;
        this.color=color;
    }

    public void showDetails()
    {
        System.out.println(brand);
        System.out.println(screen);
        System.out.println(price);
        System.out.println(size);
        System.out.println(color);
    }
}
