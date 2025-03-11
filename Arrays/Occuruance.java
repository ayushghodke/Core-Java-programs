package Tejas.Arrays;

public class Occuruance
{
    public static void main(String[] args)
    {
        int a[]={2,3,4,7,8,7,3,3,2,2,2,3,3,3,3,3,3};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int ct=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    ct++;
                    b[j]=-1;
                }
            }
            if(b[i]!=-1)
            {
                b[i]=ct;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(b[i]!=-1)
            {
                System.out.println(a[i]+" is repeted "+b[i]+" times");
            }
        }
    }
}
