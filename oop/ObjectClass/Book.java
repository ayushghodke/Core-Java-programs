package Tejas.oop.ObjectClass;

public class Book
{
    String name;
    double price;
    String author;
    int prod;
    String publication;

    public Book()
    {
        // To do Auto-Generated
    }

    public Book(String name, double price, String author, int prod, String publication)
    {
        super();
        this.name = name;
        this.price = price;
        this.author = author;
        this.prod = prod;
        this.publication = publication;
    }

    public String toString()
    {
        return "Name: " +name+", Price: "+price+",Author: "+author+",ID: "+ prod+", Publication: "+publication;
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int hasCode()
    {
        return author.hashCode();
    }
}
