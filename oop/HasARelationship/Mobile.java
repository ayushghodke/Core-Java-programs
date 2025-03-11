package Tejas.oop.HasARelationship;
import java.util.Scanner;
public class Mobile
{
    String brand;
    double price;
    String os;
    int ram;

    Battery b1;

    Scanner sc=new Scanner(System.in);

    {
        System.out.println("Enter Price");
        double a=sc.nextInt();
        System.out.println("Enter Brand");
        String b=sc.nextLine();
        System.out.println("Enter Capacity");
        int c=sc.nextInt();

        b1= new Battery(a,b,c, 1);
    }

    Mobile()
    {

    }

    Mobile(String brand, double price, String os, int ram)
    {
        this.brand=brand;
        this.price=price;
        this.os=os;
        this.ram=ram;
        System.out.println("mobile created");
    }

    public void showMobile()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(os);
        System.out.println(ram);
    }

}
