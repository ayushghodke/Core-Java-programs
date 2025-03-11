package Tejas.oop.Interface.Calculations;

public class CalculationImp implements Calculation
{
    public void AreaOfRectangle(int a, int b)
    {
        System.out.println("Aera of Rectangle---------");
        System.out.println(a*b);
    }

    @Override
    public void AeraOfSquare(int a)
    {
        System.out.println("Aera of square------");
        System.out.println(a*a);
    }

    public void Circumferance(int r)
    {
        System.out.println("circumferance of Circle---------");
        System.out.println(2*3.14*r);
    }
    public void  PerimeterOfSquare(int a)
    {
        System.out.println("Perimeter of square--------");
        System.out.println (a*4);
    }
    public void  PerimeterOfRectangle(int a, int b)
    {
        System.out.println("Perimeter of Rectangle----------");
        System.out.println (a*2+b*2);
    }
    public void  PerimeterOfTriangle(int a)
    {
        System.out.println("Perimeter of Triangle________");
        System.out.println (a*3);
    }
}
