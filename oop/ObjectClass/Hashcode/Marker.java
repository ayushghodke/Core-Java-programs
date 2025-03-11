package Tejas.oop.ObjectClass.Hashcode;

public class Marker
{
    String brand;
    double price;
    String color;
    String type;

    Marker()
    {
    }

    public Marker(String brand, double price, String color, String type)
    {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public boolean equals(Object o)
    {
        Marker m1=(Marker)o;

        if (this.brand==m1.brand && this.price==m1.price && this.color==m1.color && this.type==m1.type)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "[Brand: "+ brand+", price: "+price+", color: "+color+", Type: "+ type+"]";
    }

    public int hashCode()
    {
        int hc=0;
        hc +=brand.hashCode()+ color.hashCode()+ type.hashCode();
        return hc;
    }
}
