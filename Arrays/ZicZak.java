package Tejas.Arrays;
public class ZicZak
{
    public static void main(String[] args)
    {
        System.out.println("Zic zak pattern 1");
        int[] array = {1,2,3,4,5,6};
        // Rearrange the elements in zigzag order
        for (int i = 0; i < array.length; i += 2)
        {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        // Print the array in zigzag order
        System.out.println("Zigzag Order:");
        for (int num : array)
        {
           // System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Zic zak pattern 2");

        int [] a1={1,2,3};
        int [] a2={4,5,6};
        int [] a3= new int[a1.length+a2.length];

        for(int i=0; i<a1.length;i++)
        {
            a3[i*2]=a1[i]; //for even
            a3[i*2+1]=a2[i]; // for odd
        }

        for(int a4: a3)
        {
            System.out.print(a4+" ");
        }
    }
}
