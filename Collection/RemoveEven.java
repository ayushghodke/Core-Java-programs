package Tejas.Collection;
//CTE In list it shifts the index when we remove the elem
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class RemoveEven
{
    public static void main(String[] args)
    {
        List<Integer> l1= new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        for(Integer i:l1)
        {
            if(i%2==0)
            {
                l1.remove(i);
            }
        }
        System.out.println(l1);
    }
}
