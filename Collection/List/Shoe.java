package Tejas.Collection.List;

public class Shoe
{
    String brand;
    double price;
    int size;
    String type;

    public Shoe()
    {

    }

    public Shoe(String brand, double price, int size, String type)
    {
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        Shoe s=(Shoe) o;
        if(this.brand.equals(s.brand) && (this.price==s.price) && this.size==s.size && this.type.equals(s.type))
        {
            return true;
        }
        return false;
    }

    public int hasCode()
    {
        return brand.hashCode()+type.hashCode()+size;
    }
}
