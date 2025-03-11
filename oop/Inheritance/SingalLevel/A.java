package Tejas.oop.Inheritance.SingalLevel;
// one parent class having one child class is known as siongle level inheritance
public class A // Parent class
{
    //int a=5;
    public int add()
    {
        int a =5;
        return a;
    }

    public void showA()
    {
       // System.out.println(a);
        System.out.println("Able to access Parent class");
        System.out.println("Class A");
    }
}
