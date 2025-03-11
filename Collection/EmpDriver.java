package Tejas.Collection;
// Fix
import java.util.ArrayList;
import java.util.List;

public class EmpDriver
{
    public static void main(String[] args)
    {
        List emp =new ArrayList();
        emp.add(new Employee("Scott", 33,3500,"abc123"));
        emp.add(new Employee("King", 24,7500,"abc456"));
        emp.add(new Employee("Turner", 30,1500,"abc789"));
        emp.add(new Employee("Mike", 45,65000,"abc741"));
        System.out.println(emp);
        System.out.println(maxSal(emp));
        //System.out.println(sortEmp(emp));
    }

    public static double maxSal(List emp)
    {
        double max=0;
        Employee e =null;
        for(int i=0;i<emp.size();i++)
        {
            Employee e1=(Employee)emp.get(i); // How
            if(e1.sal>max)
            {
                max=e1.sal;
                e=e1;
            }
        }
        return max;
    }

    public static void sortEmp(List emp)
    {
        for(int i=0; i<emp.size();i++)
        {
            Employee e1 =(Employee)emp.get(i);
        }
    }
}
