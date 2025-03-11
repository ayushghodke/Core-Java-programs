package Tejas.Collection.List;
import java.util.*;

public class StudentDriver
{
    public static void main(String[] args)
    {
        List<Student> db=new ArrayList<Student>() ;
        db.add(new Student("Raju",23,001,89,2023,"PVG","Mech"));
        db.add(new Student("Moju",23,001,89,2023,"PVG","Mech"));
        db.add(new Student("Kanu",23,001,89,2023,"PVG","Mech"));
        db.add(new Student("Jadu",23,001,89,2023,"PVG","Mech"));
        db.add(new Student("Raju",23,001,89,2023,"PVG","Mech"));

        System.out.println(db);
    }

    public static List<Student> interviewEligible(List<Student> db)
    {
        List<Student> filtered =new ArrayList<>();
        for(Student s1:db)
        {
            if(s1.marks>=60)
            {
                filtered.add(s1);
            }
        }
        return filtered;
    }

    public static void removeInvalidAge(List<Student> db)
    {
        ListIterator<Student> l =db.listIterator();
        while(l.hasNext())
        {
            Student s1=l.next();
            if(s1.age<18 || s1.age>180)
            {
                l.remove();
            }
        }
    }

    public static void printdb(List<Student> db)
    {
        for(Student s:db)
        {
            System.out.println(s);
        }
    }
}
