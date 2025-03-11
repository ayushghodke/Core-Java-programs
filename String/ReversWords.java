package Tejas.String;
public class ReversWords
{
    public static void main(String[] args)
    {
        String s="Tech in air";
        String op="";
        String sentence=" ";
        for(int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)!=' ')
            {
                op=op+s.charAt(i);
            }
            else
            {
                sentence =sentence + reverse(op)+" ";
            }
        }
    }

    public static String reverse(String ip)
    {
        String rev="";
        for(int i=ip.length()-1;i==0;i--)
        {
            rev+=ip.charAt(i);
        }
        return rev;
    }
}
