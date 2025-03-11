package Tejas.oop.Interface.Shapes;

public class ShapesImp implements Shape
{
    public void square(int n)
    {
        int i;
        int j;
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void rectangle(int n, int m)

    {
        int i;
        int j;
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for (int j=n; j>i;j--)
            {
                System.out.print(" "+" ");
            }

            for(int j=0; j<2*i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
