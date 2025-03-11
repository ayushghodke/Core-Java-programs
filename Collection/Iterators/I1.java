package Tejas.Collection.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I1
{
    public static void main(String[] args)
    {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Iterator<Integer> i1=l1.iterator();
        {
            while (i1.hasNext())
            {
                System.out.println(i1.next());
            }
        }
    }
}
