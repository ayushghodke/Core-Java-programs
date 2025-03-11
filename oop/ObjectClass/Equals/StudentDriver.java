package Tejas.oop.ObjectClass.Equals;
public class StudentDriver
{
    public static void main(String[] args)
    {
        Student s1=new Student("Raju", 12,12345781);
        Student s2=new Student("Raju", 12,12345781);
    System.out.println(s1.toString());
//        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
