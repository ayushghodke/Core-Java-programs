package Tejas.oop.ConstructorOverloading;
public class A
{
    int a;
    double b;
    String c;

    A()
    {
        System.out.println("non paramaterised constructor");
        a= 100;
        b=45.2;
        c="Ayush";
    }

    A(int x)
    {
        a=200;
        System.out.println(" Constructor with x");
    }

    A(double y, String z)
    {
        b=y;
        c=z;
    }

    public static void main(String[] args)
    {
        A r=new A();
        A r1=new A(10);
//        System.out.println(r.a);
//        System.out.println(r1.a);
    }
}
