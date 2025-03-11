package Tejas.String;

public class EvenString
{
    public static void main(String[] args) {
        String s1="Tech in air";
        String s2="";

        for (int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)%2==0)
            {
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println(s2);

    }
}
