package Tejas.String;
public class AllAphab
{
    public static void main(String[] args)
    {
        String s="the quick brown  jumps over the lazy dog";
        int count[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                count[ch-97]++;
            }
        }

        int i;
        for(i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                break;
            }
        }

        if(i==count.length)
        {
            System.out.println("All are present");
        }
        else
        {
            System.out.println("Missing alphabates");
            for(int j=0;j<count.length;j++)
            {
                if(count[j]==0)
                {
                    System.out.println((char)(j+97));
                }
            }
        }
    }
}
