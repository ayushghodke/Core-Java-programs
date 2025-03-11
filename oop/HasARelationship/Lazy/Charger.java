package Tejas.oop.HasARelationship.Lazy;

public class Charger
{
    String name;
    String type;
    int watt;

    Charger()
    {
    }

    Charger(String name, String type, int watt)
    {
        this.name=name;
        this.type=type;
        this.watt=watt;
        System.out.println("Charger is loaded");
    }

    public void diaplayCharger()
    {
        System.out.println("Charger is diaplaying---------");
        System.out.println("Name:"+ name);
        System.out.println("Type: "+ type);
        System.out.println("Watt: "+ watt);
    }
}
