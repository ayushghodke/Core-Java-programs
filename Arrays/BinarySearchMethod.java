package Tejas.Arrays;
import java.util.Arrays;
public class BinarySearchMethod
{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        binarySearch(a,2);
    }

    public static void binarySearch(int[]a, int search)
    {
        int start=0;
        int end =a.length-1;
        int mid;
        int ct=0;
        mid=(start+end)/2;
        while(start<=end)
        {
            if(a[mid]==search)
            {
                System.out.println(search+"found at index: "+mid);
                System.out.println(ct);
                break;
            }
            else if(search>a[mid])
            {
                start=mid+1;
            }
            else if(search<a[mid])
            {
                end=mid-1;
            }
            mid=(start+end)/2;
            ct++;
        }

        if(start>mid)
        {
            System.out.println("Element not found");
        }
    }
}
