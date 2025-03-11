package Tejas.Arrays;

public class ReplaceIndex
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];
        int ele=9;
        int index=3;

        for(int i=0; i<a.length;i++)
        {
            if(i==index)
            {
                b[i]=ele;
            }
            else
            {
                b[i]=a[i];
            }
        }

        for(int arr:b)
        {
            System.out.println(arr);
        }
    }
}
