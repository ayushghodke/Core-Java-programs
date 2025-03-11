package Tejas.Arrays;

public class Reverse
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            b[b.length-1-i]=a[i];
        }

        for(int c :b)
        {
            System.out.print(c+",");
        }
    }
}
