package Tejas.Arrays;

public class RightRotate
{
    public static void main(String[] args)
    {
        int [] ar= {1,2,3,4,5,6};

        int last = ar[ar.length-1];

        for(int i=0; i<ar.length-1;i++)
        {
            ar[i+1]=ar[i];
        }

        ar[0]=last;

        for(int i=0; i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }

//        int []a={1,2,3,4,5};
//
//        int last=a[a.length-1];
//
//        a[0]=last;
//        for(int i=1; i<a.length-1;i++)
//        {
//            a[i+1]=a[i];
//        }
//
//        for(int i=0; i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
    }
}
