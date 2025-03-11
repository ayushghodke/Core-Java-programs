package Tejas.oop.Abstraction;

public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Calculator c1=new CalcImp1();
        System.out.println(c1.add(3,2));

        c1.instruction();

        Calculator c2=new CalcImp2();
        System.out.println(c2.add(3,2));
    }
}
