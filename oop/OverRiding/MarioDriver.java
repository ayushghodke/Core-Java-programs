package Tejas.oop.OverRiding;

public class MarioDriver
{
    public static void main(String[] args)
    {
        Mario m1=new MarioV2();
        //MarioV2 m2=new MarioV2();

        m1.moveBackword();
        System.out.println("turn left method");
        m1.turnLeft();
       // m2.jump();
    }
}
