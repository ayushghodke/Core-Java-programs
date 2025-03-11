package Tejas.Method;
// Static vs non Static
public class SVNS
{
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        SVNS r=new SVNS();
        r.Disp();
        SVNS.Show();
    }
    static void Show()
    {
        System.out.println(" Static "+ b);
    }
    void Disp()
    {
        System.out.println(" Non Static"+a+" "+b);
    }
}
