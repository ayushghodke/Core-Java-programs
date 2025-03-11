package Tejas.Collection;

import java.util.ArrayList;
import java.util.List;

public class SumEven
{
    public static void main(String[] args)
    {
        List nums =new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        int sum=0;
        for (int i = 0; i < nums.size(); i++)
        {
            int num =(Integer) nums.get(i);
            if(num%2==0)
            {
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
