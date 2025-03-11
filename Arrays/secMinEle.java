package Tejas.Arrays;

public class secMinEle
{
    public static void main(String[] args)
    {
        int a[]={32,80,45,99};
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                secMin=min;
                min=a[i];
            }

            else if (a[i]<secMin)
            {
                secMin=a[i];
            }
        }
        System.out.println(secMin);
    }
}
