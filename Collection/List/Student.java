package Tejas.Collection.List;

public class Student
{
    String name;
    int age;
    int id;
    int marks;
    int yop;
    String college;
    String Branch;

    public Student()
    {
    }

    public Student( String name,int age, int yop, int marks, int id, String college, String Branch)
    {
        this.name = name;
        this.age=age;
        this.yop = yop;
        this.marks = marks;
        this.id = id;
        this.college = college;
        this.Branch= Branch;
    }
}
