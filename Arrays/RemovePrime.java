package Tejas.Arrays;

public class RemovePrime
{
    public static void main(String[] args)
    {
        int arr[]={27,34,56,41,33,43,87,3,5};
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            int den=2;
            for(;den<=arr[i];den++)
            {
                if(arr[i]%den==0)
                {
                    break;
                }
            }
            if(den!=arr[i])
            {
                count++;
            }
        }

        int[]ans=new int[arr.length-count];
        for(int i=0,j=0;i<arr.length;i++)
        {
            int den=2;
            for(;den<=arr[i];den++)
            {
                if(arr[i]%den==0)
                {
                    break;
                }
            }
            if(den!=arr[i])
            {
                ans[j]=arr[i];
                j++;
            }

        }
    }
}
