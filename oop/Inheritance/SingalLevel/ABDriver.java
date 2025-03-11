package Tejas.oop.Inheritance.SingalLevel;

public class ABDriver  // Driver class
{
    public static void main(String[] args)
    {
        B1 b1=new B1(); // Object of child class
        b1.showA(); // Child class is accessing parent class,
        // means Class B is accessing class A
        b1.showB();
        System.out.println("CH: "+b1.ch);
    }
}
