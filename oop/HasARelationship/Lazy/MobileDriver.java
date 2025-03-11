package Tejas.oop.HasARelationship.Lazy;

public class MobileDriver
{
    public static void main(String[] args)
    {
        Mobile m1=new Mobile("redmi", "Note 5","Blue",50,15000);

        m1.displayMobile();
        System.out.println(m1.c);
        System.out.println(m1);
        m1.insertCharger("OnePlue",35,"Tyep c");
        System.out.println(m1.c);
        //Mobile m=null;  // Null pinter exception- When we call a ref variable with null value we get Null pointer exception
        //m.displayMobile();
    }
}
