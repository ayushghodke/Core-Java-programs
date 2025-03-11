package Tejas.oop.HasARelationship.Early;

public class PenDriver
{
    public static void main(String[] args)
    {
        Pen p1=new Pen("ButterFello","Cello",10);
        System.out.println("P1.r1"+ p1.r1);
        System.out.println(p1);
        p1.displayPen();
        System.out.println("------------------");
        //p1.r1.displayRefil();
    }
}
