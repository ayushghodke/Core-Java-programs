package Tejas.oop.Interface.Whyseapp;

public class WhysAppImp2 extends WhysAppImp1
{
    public WhysAppImp2(String name, long phno, int pin)
    {
        super(name,phno,pin);
    }

    public void message(String name, String msg)
    {
        if (count <=WhysApp.limit)
        {
            System.out.println(msg);
            System.out.println("message sent to "+ name);
            count++;
        }
        else
        {
            System.out.println("Your addiction is too much");
        }
    }

    public void story(String s)
    {
        System.out.println(s);
        System.out.println("story updated");
    }
}
