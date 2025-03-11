package Tejas.oop.Inheritance.SingalLevel;

public class B1 extends A  //Child class of A
{
    char ch='Z';

    public int y()
    {
        int b=4;
        return b;
    }

    public void showB()
    {
        System.out.println(ch);
        System.out.println("Child class B1 to A parent class");
    }
}
