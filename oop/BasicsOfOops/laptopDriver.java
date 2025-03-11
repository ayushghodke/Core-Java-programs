package Tejas.oop.BasicsOfOops;
public class laptopDriver
{
    public static void main(String[] args)
    {
        laptop l1 = new laptop();
        l1.brand="hp";
        l1.rom=1256;
        l1.ram=8;
        l1.price=62000;
        l1.os="windows";
        l1.processor="i5 12200u";
        l1.showLaptopDetails();

        System.out.println("--------");

        laptop l2 = new laptop();
        l2.brand="Acer";
        l2.rom=521;
        l2.ram=16;
        l2.price=48000;
        l2.os="windows";
        l2.processor="i5 9300h";
        l2.showLaptopDetails();

        System.out.println("--------");

        laptop l3 = new laptop();
        l3.brand="Asus";
        l3.rom=512;
        l3.ram=16;
        l3.price=55000;
        l3.os="windows";
        l3.processor="r5 7530u";
        l3.showLaptopDetails();
    }
}
