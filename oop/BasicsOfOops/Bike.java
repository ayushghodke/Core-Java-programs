package Tejas.oop.BasicsOfOops;
public class Bike
{
    String name;
    double price;
    String color;
    int cc;
    int milage;

    public void showBikeDetails()
    {
        // String name="Chapri";
        System.out.println("Name: "+ name);
       // System.out.println("Name: "+ this.name);
        //   System.out.println(name);
        System.out.println("Price:" + price);
        System.out.println("Color:" + color);
        System.out.println("CC:" + cc);
        System.out.println("Milage: "+milage);
    }
}
