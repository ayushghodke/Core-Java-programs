package Tejas.Collection.Iterators;

import java.util.*;

public class I2
{
    public static void main(String[] args)
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        ListIterator<Integer> li=l1.listIterator();
        System.out.println("hasPrevious: "+li.hasPrevious());
    }
}
