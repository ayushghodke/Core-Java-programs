package Tejas.oop.ObjectClass;

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return "Hey";
    }
}

public class P1
{
    public static void main(String a[])
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj);

        Laptop obj2=new Laptop();
        obj2.model = "Acer Aspire";
        obj2.price = 55000;
        System.out.println(obj2);
    }
}
