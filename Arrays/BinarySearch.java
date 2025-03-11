package Tejas.Arrays;
import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a[]={11,22,33,44,55,66,77,88,99};

        int search=sc.nextInt();
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;

        while(start<=end)
        {
            if(a[mid]==search)
            {
                System.out.println("element found at middle: "+a[mid]);
                break;
            }
            else if (search<a[mid])
            {
                end=mid-1;
            }

            else if (search>a[mid])
            {
                start=mid+1;
            }

            mid=(start+end)/2;
        }
        if(start>end)
        {
            System.out.println("element is not found");
        }
    }
}
