package Tejas.oop.Interface.Calculators;
public class CalcDriver
{
    public static void main(String[] args)
    {
        Calculator c1=new CalculatorImp1();
        c1.add(23,27);
        c1.add(78,98);
        c1.divide(4,2);
    }
}
