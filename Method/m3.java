package Tejas.Method;
public class m3
{
    static void change(int a)
    {
        a=89;
    }

    public static void main(String[] args)
    {
        int [] marks = {52, 73, 77, 89};
        int x=45;
        change(x);
        System.out.println("the value of x after running change is: " +x);
    }
}
