package Tejas.Arrays;
public class LeftRotateArray
{
    public static void main(String[] args)
    {
        int [] ar = {1,2,3,4,5,6};
        int first = ar[0];

        for(int i =0; i< ar.length-1; i++)
        {
            ar[i]=ar[i+1];
        }

        ar[ar.length-1]= first;

        for(int i=0; i< ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
