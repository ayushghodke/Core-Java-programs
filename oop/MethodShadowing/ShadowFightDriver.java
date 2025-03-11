package Tejas.oop.MethodShadowing;
public class ShadowFightDriver
{
    public static void main(String[] args) 
    {
        ShadowFight sf1=new ShadowFightV2();
        sf1.turnLeft(); // Static method should be called by classname
        ShadowFight.turnLeft();
    }
}
