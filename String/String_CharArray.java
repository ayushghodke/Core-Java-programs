package Tejas.String;
import java.util.Arrays;
public class String_CharArray
{
    public static void main(String[] args)
    {
        String s="Ayush";
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
    }
}
