package Tejas.Arrays;

public class SortingL2H
{
    public static void main(String[] args)
    {
        int a[]={80,70,60,50,40};

        for(int cycle=0;cycle<a.length-1;cycle++)
        {
            for(int swapper=0;swapper<a.length-cycle-1;swapper++)
            {
                if(a[swapper]>a[swapper+1])
                {
                    int temp=a[swapper];
                    a[swapper]=a[swapper+1];
                    a[swapper+1]=temp;
                }
            }
        }
        for(int b:a)
        {
            System.out.println(b);
        }
    }
}
