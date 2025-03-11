package Tejas.oop.Interface.Calculators;
public class CalculatorImp1 implements Calculator
{
    public void add(int c,int d)
    {
        System.out.println(c+d);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    public void divide(double a,double b)
    {
        System.out.println(a/b);
    }
}
