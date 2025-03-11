package Tejas.oop.ObjectClass.Equals;

public class Student
{
    String name;
    int age;
    long phno;

    public Student(String name, int age, long phno)
    {
        this.name = name;
        this.age = age;
        this.phno = phno;
    }

    @Override
    public String toString()
    {
       // return "[Name: "+name+", Age:"+age+", Phno:"+phno+"]";
        return name+age+phno ;
    }

    public boolean equals(Object obj)
    {
        Student s = (Student)obj;
        if (this.name==s.name&&this.age==s.age&&this.phno==s.phno)
        {
            return true;
        }
        return false;
    }
}
