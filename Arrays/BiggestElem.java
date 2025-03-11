package Tejas.Arrays;

public class BiggestElem
{
    public static void main(String[] args)
    {
     int a[]={32,80,45,99};
     int max=-2145678;
     for(int i=0;i<a.length;i++)
     {
         if(a[i]>max)
         {
             max=a[i];
         }
     }
        System.out.println(max);
    }
}
