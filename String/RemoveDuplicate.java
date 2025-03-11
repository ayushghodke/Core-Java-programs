package Tejas.String;
//fix
public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        String s="abcabcde";
        System.out.println();
        System.out.println(removeDuplicate(s));
    }

    public static String remove(String ip, int index) {
        String op="";
        for(int i=0;i<ip.length();i++)
        {
            if(i!=index)
            {
                op+=ip.charAt(i);
            }
        }
        return op;
    }

    public static String removeDuplicate(String ip)
    {
        for(int i=0;i<ip.length();i++)
        {
            for (int j = i+1; j <ip.length() ; j++)
            {
                if(ip.charAt(i)==ip.charAt(j))
                {
                    remove(ip,j);
                }
                else
                {
                    j++;
                }
            }
        }
        return ip;
    }
}
