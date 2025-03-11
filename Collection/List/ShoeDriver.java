package Tejas.Collection.List;
import java.util.ArrayList;
import java.util.List;

public class ShoeDriver
{
    public static void main(String[] args)
    {
        List<Shoe> s1=new ArrayList<>();

        s1.add(new Shoe("Puma",2000,8,"Sports"));
        s1.add(new Shoe("Adidas",3500,9,"Sports"));
        s1.add(new Shoe("Nike",4000,7,"Joggers"));
        s1.add(new Shoe("Reebok",1100,10,"Sports"));
        s1.add(new Shoe("Spark",700,8,"Sneakers"));
        s1.add(new Shoe("Bata",1500,7,"Formal"));
    }
}
