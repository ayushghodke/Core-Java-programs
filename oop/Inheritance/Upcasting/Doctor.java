package Tejas.oop.Inheritance.Upcasting;
// Parent class
public class Doctor
{
    String name;
    String degree="MBBS";
    String hospital;
    double fees;

    public Doctor()
    {

    }

    public Doctor(String name, String hospital, double fees)
    {
        this.name = name;
        this.hospital = hospital;
        this.fees = fees;
    }

    public void showDoctor()
    {
        System.out.println("Doctor name: "+ name);
        System.out.println("Doctor Degree: "+ degree);
        System.out.println("Hospital: "+ hospital);
        System.out.println("Fees: "+ fees);
    }

}
