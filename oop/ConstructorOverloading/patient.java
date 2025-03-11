package Tejas.oop.ConstructorOverloading;

public class patient
{
    String name;
    int age;
    String gender;
    String problem;
    long phno;
    String add;
    String blood;
    String dob;
    String dod;
    double wt;
    String test;

    patient()
    {
    }

    patient( String name, int age, String gender, String problem, long phno, String add, String blood,double wt, String dob)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.problem=problem;
        this.phno=phno;
        this.add=add;
        this.blood=blood;
        this.wt=wt;
        this.dob=dob;
    }

    patient(String name, int age, String gender, String problem, long phno, String add, String blood)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.problem=problem;
        this.phno=phno;
        this.add=add;
        this.blood=blood;
    }


    public void displayPatient()
    {
     // System.out.println(hospital);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(problem);
        System.out.println(phno);
        System.out.println(add);
        System.out.println(blood);
        System.out.println(dob);
        System.out.println(dod);
        System.out.println(wt);
        System.out.println(test);
    }
}
