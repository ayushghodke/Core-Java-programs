package Tejas.Arrays;
public class Vovels
{
    public static void main(String[] args)
    {
        char [] name={'a','b','c','d','e','f'};
        int vo=0;
        int count=0;
        for(int i=0; i<name.length;i++)
        {
            if (name[i] == 'a' || name[i]== 'e' || name[i]=='i' || name[i]=='o')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
