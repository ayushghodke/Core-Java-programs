package Tejas.Arrays;
//Find smallest value present in the array
public class SmallestEle
{
    public static void main(String[] args)
    {
        int a[]={32,80,45,99};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);


    }
}
