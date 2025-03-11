package Tejas.Collection;

import java.util.ArrayList;
import java.util.*;

public class RemoveEle2
{
    public static void main(String[] args)
    {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        ListIterator <Integer> i1 = l1.listIterator();

        while (i1.hasNext())
        {
            int num=i1.next();
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }
}
