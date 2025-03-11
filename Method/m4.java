package Tejas.Method;
public class m4
{
    static void foo()
    {
        System.out.println(" Method which as no formal arguments");
    }

    static void foo(int a)
    {
        System.out.println(" Method which has int as a formal argument");
    }

    public static void main(String[] args)
    {
        foo();
        foo(5);
    }
}
