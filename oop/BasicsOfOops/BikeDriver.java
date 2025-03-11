package Tejas.oop.BasicsOfOops;
public class BikeDriver
{
    public static void main(String[] args)
    {
        Bike b1=new Bike();
        b1.name="Duke 390";
        b1.price=400000;
        b1.color="orange";
        b1.showBikeDetails();
        System.out.println(" ");
        System.out.println("b1.color: "+ b1.color);
        System.out.println("b1.toString: "+b1.toString());
        System.out.println("b1: "+b1);

        Bike b2=new Bike();
        b2.name="Ola S1 pro";
        b2.price=160000;
        b2.color="Liquid silver";
        b2.showBikeDetails();
    }
}
