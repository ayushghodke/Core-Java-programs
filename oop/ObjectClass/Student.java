package Tejas.oop.ObjectClass;

public class Student
{
    String name;
    int age;
    String gender;
    String coll;
    String prn;
    String branch;

//    public Student()
//    {
//
//    }

    public Student(String name, int age, String gender, String coil, String prn, String branch)
    {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.coll = coll;
        this.prn = prn;
        this.branch = branch;
    }

    public String toString()
    {
        return "Name: "+name ;
    }


//    @Override
//    public String toString() //Computer generated
//    {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", coll='" + coll + '\'' +
//                ", prn='" + prn + '\'' +
//                ", branch='" + branch + '\'' +
//                '}';
//    }
}
