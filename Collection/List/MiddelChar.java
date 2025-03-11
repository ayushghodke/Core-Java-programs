package Tejas.Collection.List;
// Remove names which are having char 'a' in middle
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MiddelChar
{
    public static void main(String[] args)
    {
        List<String> l1= new ArrayList<String>();
        l1.add("Ravi");
        l1.add("Mahesh");
        l1.add("Raj");
        l1.add("Swati");

        ListIterator<String> l=l1.listIterator();

        while (l.hasNext())
        {
            String name=l.next();
            if(name.charAt(name.length()/2)=='a')
            {
                l.remove();
            }
        }
        System.out.println(l1);
    }
}
