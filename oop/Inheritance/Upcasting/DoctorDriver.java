package Tejas.oop.Inheritance.Upcasting;
public class DoctorDriver
{
    public static void main(String[] args)
    {
//         Cardiologist c1 = new Cardiologist("Javed", "Sasun", 200, "MD", "Heart");
//         c1.showDoctor();
//        c1.showCardiologist();

        Doctor d1=new Cardiologist("Ayush", "Saainath",500.00,"Gyno","Heart");   //UpCasting
       // d1.showCardiologist();  // It shows compile time error,
        // becauese we can not access child class members with using spuer class refrence
       d1.showDoctor();
        //System.out.println("------");

//        Neurologist n1 = new Neurologist("Omkar", "Sasun", 500, "MD", "Brain");
//        //n1.showDoctor();

//        Cardiologist car=(Cardiologist) d1;
//        car.showCardiologist();
//        System.out.println("Downcasting below-------");
//        car.showDoctor();

    }
}
