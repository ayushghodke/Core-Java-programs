package Tejas.oop.Interface.Whyseapp;

public interface WhysApp
{
    public static final int limit=100;

    public abstract void message(String name, String msg);

    void post(String write);

    void comment(String name,String com);

    public static void greetings(String name)
    {
        System.out.println("Hey ....");
    }

    void story(String type);
}
