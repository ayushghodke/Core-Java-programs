package Tejas.oop.ObjectClass;

public class BookDriver
{
    public static void main(String[] args)
    {
        Book b1=new Book("My life", 100.00,"Raju",23145,"Rani Publication");
        System.out.println(b1);

        Book b2=new Book("My worst life", 100.00,"Raju",23147,"Devdas");
        System.out.println(b2);

        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode()==b2.hashCode());

    }
}
