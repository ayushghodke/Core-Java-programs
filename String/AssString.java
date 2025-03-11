package Tejas.String;

public class AssString
{
    public static void main(String[] args) {
        String s1="Gauri".toUpperCase();
        System.out.println(sort(s1));
    }

    public static String sort(String s1)
    {
        char [] ch= stringToCharArray(s1);
        for (int i=0;i<s1.length()-1;i++)
        {
            if(ch[i]>ch[i+1])
            {
                char temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;
            }
        }
        return new String(ch);
    }
    public static char[] stringToCharArray(String s1)
    {
        char ch[] = new char[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            ch[i] = s1.charAt(i);
        }
        return ch;
    }
}

