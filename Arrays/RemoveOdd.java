package Tejas.Arrays;

public class RemoveOdd
{
    public static void main(String[] args)
    {
        int arr[]={23,1,2,3,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }

        int [] ans=new int[arr.length-count];
        for(int i=0,j=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                ans[j]=arr[i];
                j++;
            }
        }
        for(int b:ans)
        {
            System.out.println(b);
        }
    }
}
