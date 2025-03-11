package Tejas.oop.Interface.Whyseapp;
public class WhysAppDriver
{
    public static void main(String[] args)
    {
       WhysApp w1= new WhysAppImp1("Raju", 7894563, 1234)
       {
           @Override
           public void message(String name, String msg)
           {
           }

           @Override
           public void story(String type)
           {
           }
       };
//  Ayush Ghodke is tech in air. Tech in air is the youtuber. Your channel is absolute best.
//  123456789.

       w1.post("I am happy");
       w1.comment("Angle Priya","Did you see me anywhere");
       w1.message("Anjel Priya", "jevlis ka?");
    }
}
