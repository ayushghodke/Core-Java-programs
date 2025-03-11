package Tejas.oop.WrapperClass;

public class Boxing
{
    public static void main(String[] args)
    {
        // int a=10;   //premitive
        Integer b =new Integer(10);  //Boxing
        System.out.println("non pre "+b);
        int  c = b.intValue();             //Unboxing
        System.out.println(c);
    }
}
