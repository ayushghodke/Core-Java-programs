package Tejas.oop.Inheritance.Hierarchial;
import Tejas.oop.Inheritance.SingalLevel.A;
public class B2 extends A
{
    String s1= "Subscribe to Tech in Air channel";
    public void showB2()
    {
        System.out.println(" tech in air is executing class B2 " +
                "is accessing parent class A");
        System.out.println(s1);
    }
}
