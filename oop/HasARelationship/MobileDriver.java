package Tejas.oop.HasARelationship;

public class MobileDriver
{
    public static void main(String[] args)
    {
        Mobile m1=new Mobile("nokia", 21000,"windows",4);
        m1.showMobile();
        m1.b1.showBattery();
    }
}
