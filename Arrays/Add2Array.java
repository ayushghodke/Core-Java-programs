package Tejas.Arrays;

import java.util.Arrays;

public class Add2Array
{
    public static void main(String[] args)
    {
        int a []={1,2,3};
        int b []={4,5,6,7,8};
        int c []=new int[a.length+ b.length];


        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[i-a.length];
            }
        }

//        for( int num : c )
//        {
//            System.out.print(num+",");
//        }

        System.out.println(Arrays.toString(c));
    }
}
