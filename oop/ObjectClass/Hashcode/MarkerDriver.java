package Tejas.oop.ObjectClass.Hashcode;

public class MarkerDriver
{
    public static void main(String[] args)
    {
       Marker m1=new Marker("Camlin",50.0,"Blak","Permanent");
       Marker m2=new Marker("Camlin",50.0,"Blak","Permanent");

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}
