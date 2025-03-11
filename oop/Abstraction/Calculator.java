package Tejas.oop.Abstraction;

public abstract class Calculator
{
    public abstract int add(int a, int b);

    public abstract double division(double d1, double d2);

    public Calculator()
    {

    }

    public static void instruction()
    {
        System.out.println("---->");
    }
}
