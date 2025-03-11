package Tejas.Method.MethodOverloading;

public class MangoDriver
{
    public static void main(String[] args)
    {
        Mango m1=new Mango();
        Mango m2=new Mango();
        m1.displayName();
        m1.displayOrigin();
        m2.displayOrigin();

        m2.name="Langda";
        System.out.println(m2.name);
    }
}
