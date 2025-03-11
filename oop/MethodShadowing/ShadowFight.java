package Tejas.oop.MethodShadowing;

public class ShadowFight
{
    public static void turnRight()
    {
        System.out.println("Turn right");
    }

    public static void turnLeft()
    {
        System.out.println("turn Right"); // By mistake
    }

    public static void moveForword()
    {
        System.out.println("Move Forword");
    }

    public static void moveBackword()
    {
        System.out.println("Move Forword"); // By mistake
    }
}
