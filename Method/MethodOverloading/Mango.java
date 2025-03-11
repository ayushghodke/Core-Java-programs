package Tejas.Method.MethodOverloading;

public class Mango
{
    String name="Hapus";
    int price=150;
    String origin="Rajasthani";

    public Mango displayName()
    {
        System.out.println(name);
        return this;
    }
     public Mango displayPrice()
     {
         System.out.println(price);
         return this;
     }

     public Mango displayOrigin()
     {
         System.out.println(origin);
         return this;
     }
}
