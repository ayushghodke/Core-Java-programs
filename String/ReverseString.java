package Tejas.String;

public class ReverseString
{
    public static void main(String[] args)
    {
        String s="TechInAir";
        String str="";
        char c1;

        for(int i=0;i<s.length();i++)
        {
             c1=s.charAt(i);
             str=c1+str;
        }
        System.out.println(str);


//        String s="Hello";
//        String concat;
//        for(int i=s.charAt(i);i>0;i--)
//        {
//            concat=" "+s.charAt(i);
//            System.out.println(concat);
//        }
    }
}

