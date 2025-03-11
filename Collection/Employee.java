package Tejas.Collection;

public class Employee
{
    String name;
    int age;
    double sal;
    String smpId;

    public Employee()
    {
    }

    public Employee(String name, int age, double sal, String smpId)
    {
        super();
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.smpId = smpId;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", smpId='" + smpId + '\'' +
                '}';
    }
}
