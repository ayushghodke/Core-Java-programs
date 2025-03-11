package Tejas.String;

import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String pass=sc.next();

        if(pass.equals("Tia#9021")) // WE cant use == oprator here
        {
            System.out.println("Login successful");
        }

        else
        {
            System.out.println("Invalid password");
        }
    }
}
