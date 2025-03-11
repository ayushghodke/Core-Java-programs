package Tejas.Collection.CollectionClass;
import java.sql.SQLOutput;
import java.util.*;
public class Methods
{
    public static void main(String[] args)
    {
        List<Integer> l1=Arrays.asList(7,4,1,8,5,2,9,6,3,0);
        System.out.println("Sorting.....");
        Collections.sort(l1);
        System.out.println(l1);

        System.out.println(Collections.binarySearch(l1,1));

        Collections.fill(l1,0);
        System.out.println(l1);

        System.out.println("COllection frequency "+Collections.frequency(l1,3));

        List<Integer> l2=Arrays.asList(3,3,3);
        System.out.println(Collections.indexOfSubList(l1,l2));
        System.out.println(Collections.lastIndexOfSubList(l1,l2));
        System.out.println(""+Collections.max(l1));


    }
}
