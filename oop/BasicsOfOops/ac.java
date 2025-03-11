package Tejas.oop.BasicsOfOops;
public class ac
{
    String brand;
    double price;
    String color;
    String type;
    int capacity;
    int ambiant;
    int maxTemp;
    int minTemp;

    public void incTemp()
    {
        if (ambiant<maxTemp)
        {
            ambiant++;
        }
        else
        {
            System.out.println(" max temp reached");
        }
    }
    public void decTemp()
    {
        if (ambiant>minTemp)
        {
            ambiant--;
        }
        else
        {
            System.out.println(" min temp reached");
        }
    }
    public void showAmbiantTemp()
    {
        System.out.println("Ambiant Temp: "+ ambiant+ "*C");
    }
    public void showMaxTemp()
    {
        System.out.println("Max Temp: " + maxTemp + " *C");
    }
    public void showMinTemp()
    {
        System.out.println("Min Temp: " + minTemp + " *C");
    }
    public void showDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " ton");
        System.out.println("Ambiant: " + ambiant+ " *C");
        System.out.println("Max Temp: " + maxTemp + " *C");
        System.out.println("Min Temp: " + minTemp+ " *C");
    }
}
