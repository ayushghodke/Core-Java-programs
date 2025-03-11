package Tejas.oop.Abstraction;

public class CalcImp2 extends Calculator
{
    public int add(int a, int b)
    {
        System.out.println("CalcImp 2 Class add is getiing executed");
        return a+b;
    }

    public double division(double d1, double d2)
    {
        System.out.println("CalcImp 2 division Class is getiing executed");
        return d1/d2;
    }
}
