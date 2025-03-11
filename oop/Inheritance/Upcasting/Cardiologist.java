package Tejas.oop.Inheritance.Upcasting;
public class Cardiologist extends Doctor
{
    String spl;
    String organ;

    public Cardiologist()
    {
    }

    public Cardiologist( String name, String hospital, double fees, String spl,String organ)
    {
        super(name, hospital, fees);
        this.spl=spl;
        this.organ=organ;
    }

    public void showCardiologist()
    {
        showDoctor();
        System.out.println("specilization: "+ spl);
        System.out.println("Organ: "+ organ);
    }
}
