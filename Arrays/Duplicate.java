package Tejas.Arrays;

public class Duplicate
{
    public static void main(String[] args)
    {
       int [] a={1,2,3,4};
       int [] b= new int[a.length];

       for(int i=0;i<a.length;i++)
       {
           b[i]=a[i];
       }

       for(int c:b)
       {
           System.out.println(c);
       }
    }
}
