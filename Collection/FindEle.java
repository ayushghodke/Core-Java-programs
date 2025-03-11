package Tejas.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEle
{
    public static void main(String[] args)
    {
        List flower = new ArrayList<>();
        flower.add("Rose");
        flower.add("Lili");
        flower.add("Lotus");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of flower: ");
        String find =sc.nextLine();
        if(flower.contains(find))
        {
            System.out.println("Found At Index: "+flower.indexOf(find));
        }
    }
}
