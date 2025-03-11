package Tejas.oop.Interface.Calculations;

public class CalculationDriver
{
    public static void main(String[] args)
    {
        Calculation c1=new CalculationImp();
        c1.AeraOfSquare(5);
        c1.AreaOfRectangle(5,6);
        c1.Circumferance(5);
        c1.PerimeterOfRectangle(4,5);
        c1.PerimeterOfSquare(4);
    }
}
