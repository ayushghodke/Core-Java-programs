package Tejas.oop.ConstructorOverloading;

public class patientDriver
{
    public static void main(String[] args)
    {
    //    patient p1=new patient();
    //    p1.displayPatient();

        System.out.println(" ---------");

     patient p2=new patient("Aditya", 50, " male", " telling name as kabir sing", 902, " yasrwada", "o+",65,"04/04/2001" );
       p2.displayPatient();

      //  patient p3=new patient("Rohan", 56, "male", "telling I am mad", 1234567890, " Deccan", " o+", 70, "04-01-2000", 420, )

    }
}
