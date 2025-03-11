package Tejas.oop.HasARelationship;

public class Battery
{
    double price;
    String brand;
    int cap;
    int warrenty;

    Battery()
    {

    }

    Battery(double price,String brand, int cap, int warrenty)
    {
        this.brand=brand;
        this.price=price;
        this.cap=cap;
        this.warrenty=warrenty;
        System.out.println("Battery is created");
    }

    public void showBattery()
    {
        System.out.println("brand :" + brand);
        System.out.println("price :" + price);
        System.out.println("cap :"+ cap);
        System.out.println("warrenty :"+ warrenty);
    }
}
