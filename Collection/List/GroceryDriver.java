package Tejas.Collection.List;
import java.util.*;
public class GroceryDriver
{
    public static void main(String[] args)
    {
        List<Grocery> gr=new ArrayList<>();
        gr.add(new Grocery("Rice",85,2));
        gr.add(new Grocery("Suger",20,3));
        gr.add(new Grocery("Parle-G",5,10,"Parle"));
        gr.add(new Grocery("Tooth paste",2,25,"Colgate"));
        gr.add(new Grocery("Melody",10,2,"Parle"));
        gr.add(new Grocery("God Day",5,20,"Parle"));
        gr.add(new Grocery("Milkey Bar",10,10,"Nestle"));
        gr.add(new Grocery("Bathroom Cleaner",1,120,"Harpic"));
        gr.add(new Grocery("Hand Wash",1,40,"Detol"));
        printCart(gr);
        //totalSum(gr,barnd: "colgate", per:10);

    }
    public static void totalSum(List<Grocery> l, String brand, int per)
    {
        double sum=0;
        if((brand !=null || brand!="") && per>0)
        {
            for(Grocery grocery:l)
            {
                if(grocery.brand.equalsIgnoreCase(brand))
                {
                    double discount=grocery.price+grocery.qty*.0;
                    sum=sum-discount;
                }
                else
                {
                    sum = sum + grocery.price * grocery.qty;
                }
            }
        }
    }

    public static void totalSum(List<Grocery> l)
    {
        double sum=0;
        for(Grocery grocery: l)
        {
            sum+=(grocery.price*grocery.qty);
        }
        System.out.println("Your Total bill: " + sum);
    }

    public static void printCart(List<Grocery> l)
    {
        for(Grocery grocery: l)
        {
            System.out.println(grocery);
        }
    }

}
