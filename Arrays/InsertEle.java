package Tejas.Arrays;
public class InsertEle
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length+1];
        int ele=9;
        int index=3;

        if(index>=0 && index<a.length)
        {
            for(int i=0; i<b.length;i++)
            {
                if(i<index)
                {
                    b[i]=a[i];
                }
                else if(i==index)
                {
                    b[i]=ele;
                }
                else if(i>index)
                {
                    b[i]=a[i-1];
                }
            }
        }
        for(int arr:b)
        {
            System.out.println(arr);
        }
    }
}
