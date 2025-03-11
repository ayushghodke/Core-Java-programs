package Tejas.Arrays;

public class SkipEle
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length-1];
        int index=3;

        for(int i=0; i<a.length;i++)
        {
            if(i<index)
            {
                b[i]=a[i];
            }
            else if(i>index)
            {
                b[i-1]=a[i];
            }
        }

        for(int arr:b)
        {
            System.out.println(arr);
        }
    }
}
