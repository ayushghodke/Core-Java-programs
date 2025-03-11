package Tejas.oop.BasicsOfOops;
public class acDriver
{
    public static void main(String[] args)
    {
        ac ac1=new ac();
        ac ac2=new ac();

        ac1.brand="Blur Star";
        ac1.price=80000;
        ac1.color="White";
        ac1.type="Central";
        ac1.ambiant=20;
        ac1.maxTemp=25;
        ac1.minTemp=15;
        ac1.capacity=5;
        ac1.showDetails();
        System.out.println("-------------");

        ac1.showAmbiantTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.incTemp();
        ac1.showAmbiantTemp();
        System.out.println( );
        ac2.brand="Samsung";
        ac2.price=95000;
        ac2.color="Gray";
        ac2.type="Wall";
        ac2.ambiant=24;
        ac2.maxTemp=40;
        ac2.minTemp=5;
        ac2.capacity=8;
        ac2.showDetails();
        System.out.println("-------------");

    }
}
