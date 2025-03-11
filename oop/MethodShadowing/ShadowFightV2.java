package Tejas.oop.MethodShadowing;

public class ShadowFightV2 extends ShadowFight
{
    public static void turnLeft()
    {
        System.out.println("turn Left"); // Fixed in version 2
    }

    public static void moveBackword()
    {
        System.out.println("Move Backword");  // Fixed in version 2
    }

    public static void jump()
    {
        System.out.println("Jump");
    }
}
