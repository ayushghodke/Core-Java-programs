package Tejas.oop.Interface.Shapes;

public class ShapesDriver
{
    public static void main(String[] args)
    {
        Shape s1= new ShapesImp();
        System.out.println();
        System.out.println("Square--------------");
        s1.square(4);
        System.out.println("Rectangle ----------");
        s1.rectangle(4,25);
        System.out.println("Triangle--------------");
        s1.triangle(5);
    }
}
