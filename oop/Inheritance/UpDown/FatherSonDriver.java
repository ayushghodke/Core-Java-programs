package Tejas.oop.Inheritance.UpDown;

public class FatherSonDriver
{
    public static void main(String[] args)
    {
        Father f1=new Son();  //Upcasting
//        f1.CarDriving();
//         f1.BikeRiding();

        Son s1=(Son)f1;      //Downcasting
        s1.BikeRiding();
        s1.CarDriving();
    }
}
