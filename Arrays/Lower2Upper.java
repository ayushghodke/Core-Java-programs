package Tejas.Arrays;

public class Lower2Upper
{
    public static void main(String[] args)
    {
        char[]a={'a','b','c','d'};
        char []b=new char[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='a'&& a[i]<='z')
            {
                int c=(int)a[i];
                c=c-32;
                b[i]=(char) c;
            }
        }
        for(char d:b)
        {
            System.out.println(d);
        }
    }
}
