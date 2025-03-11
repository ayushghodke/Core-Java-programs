package Tejas.Arrays;

public class ZIcZak3
{
    public static void main(String[] args)
    {
        int [] a1={1,2,3,7,8,9,4,6};
        int [] a2={4,5,6,7,8,9};
        int [] a3= new int[a1.length+a2.length];
        // int mem=0;

        if(a1.length<a2.length)
        {
            for (int i = 0; i < a3.length; i++)
            {
                if (i < a1.length)
                {
                    a3[i * 2] = a1[i];
                    a3[i * 2 + 1] = a2[i];
                }
                 
                else 
                {
                    a3[i] = a2[i - a1.length];
                    // c[i]=b[i-a.length];

                }
                // a3[i*2]=a1[i];   //for even
                // a3[i*2+1]=a2[i]; // for odd
            }

            for (int arr : a3)
            {
                System.out.print(arr + " ");
            }
        }

        else
        {
            for (int i = 0; i < a3.length; i++)
            {
                if (i < a2.length)
                {
                    a3[i * 2] = a1[i];
                    a3[i * 2 + 1] = a2[i];
                } else
                {
                    a3[i] = a1[i - a2.length];
                    // c[i]=b[i-a.length];

                }
                // a3[i*2]=a1[i];   //for even
                // a3[i*2+1]=a2[i]; // for odd
            }

            for (int arr : a3)
            {
                System.out.print(arr + " ");
            }
        }

        int a4 [] = new int[a3.length];
//        for( int i=a3.length-1 ,int j=0; i>0, j<a3.length; i--,j++)
//        {
//            a4 [j] =a3[j];
//            j++;
//        }
//        for (int arr : a4)
//        {
//            System.out.print(arr + " ");
//        }
    }
}
