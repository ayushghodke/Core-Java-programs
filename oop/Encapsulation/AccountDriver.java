package Tejas.oop.Encapsulation;
public class AccountDriver
{
    public static void main(String[] args)
    {
        Account a1= new Account("Raju",
                " ICICI", 50000.00, "ICICI1232",
                "DECCAN", 987654321,9021 );

      System.out.println(a1.getBalance(987654321,9021));
     // a1.deposit(987654321,9021,5000);
     // a1.deposit(987654321,9021,5000)//  System.out.println(a1.getBalance(987654321,9021));
    }
}
