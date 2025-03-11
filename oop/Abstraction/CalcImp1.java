package Tejas.oop.Abstraction;

public class CalcImp1 extends Calculator
{
    public int add(int a, int b)
    {
        System.out.println("CalcImp 1 Class add is getiing executed");
        int res=a+b;
        return res;
    }

    public double division(double d1, double d2)
    {
        System.out.println("CalcImp 1 division Class is getiing executed");
        double ans=d1/d2;
        return ans;
    }
}
