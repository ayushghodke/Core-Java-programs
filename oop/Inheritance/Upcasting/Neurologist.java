package Tejas.oop.Inheritance.Upcasting;
public class Neurologist extends Doctor
{
    String spl;
    String organ;

    Neurologist()
    {

    }

    Neurologist(String name, String hospital, double fees, String spl, String organ)
    {
        super(name, hospital, fees);
        this.spl=spl;
        this.organ=organ;
    }

    public void showNeurologist()
    {
        showDoctor();
        System.out.println("Sprcilization: "+ spl);
        System.out.println(" Organ: "+ organ);
    }

}
