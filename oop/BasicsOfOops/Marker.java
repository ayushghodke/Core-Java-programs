package Tejas.oop.BasicsOfOops;

import java.sql.SQLOutput;

public class Marker
{
    String brand = " Camlin";
    double price;
    String color;
    String type;
    int nib;

    public void showMarkerDetails()
    {
        System.out.println("brand: "+ brand);
        System.out.println("price: "+ price);
        System.out.println("color: "+ color);
        System.out.println("type: "+ type);
        System.out.println("thickness: "+ nib);
    }
}
