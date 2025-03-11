package Tejas.Arrays;

public class nd2MaxValu
{
    public static void main(String[] args)
    {
        int a[]={32,80,45,99};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                secMax=max;
                max=a[i];
            }

            else if (a[i]>secMax)
            {
                secMax=a[i];
            }
        }
        System.out.println(secMax);
    }
}
