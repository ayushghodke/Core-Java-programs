package Tejas.oop.Interface.Whyseapp;

public abstract class WhysAppImp1 implements WhysApp
{
    int count =0;
    String name;
    long phno;
    int pin;

    public WhysAppImp1(String name, long phno, int pin)
    {
        super();
        this.name = name;
        this.phno = phno;
        this.pin = pin;

        System.out.println("Account created");
    }

    @Override
    public void comment(String name, String com)
    {
        System.out.println(com);
        System.out.println(name+" commented");
    }

    public void message(String msg)
    {
        if(count<=WhysApp.limit)
        {
            System.out.println(msg);
            System.out.println("message sent!");
            count++;
        }

        else
        {
            System.out.println("Your addiction is too much");
        }
    }

    @Override
    public void post(String write)
    {
        System.out.println(write);
        System.out.println("posted");
    }

}
