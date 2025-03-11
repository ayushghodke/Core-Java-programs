package Tejas.oop.Encapsulation;
public class Account
{
    private String name;
    private String bank;
    private double balance;
    private String ifsc ;
    private String location ;
    private int accno;
    private int pin;

    Account()
    {
        // to do auto generated
    }

    Account(String name, String bank, double balance,
            String isfc, String location, int accno, int pin )
    {
        this.name=name;
        this.bank=bank;
        this.balance=balance;
        this.ifsc=ifsc;
        this.location=location;
        this.accno=accno;
        this.pin=pin;
    }

    public String getName()
    {
        return name;
    }

    public String getbank()
    {
        return bank;
    }

    public String getIfsc()
    {
        return ifsc;
    }

    public int getAccno()
    {
        return accno;
    }

    public int getPin()
    {
        return pin;
    }

    public void withraw( int accno, int pin, double amt)
    {
        if (this.accno == accno && this.pin == pin)
        {
            System.out.println(" login successful");
            if (balance - amt >=0 && amt > 0)
            {
                balance=balance - amt;
                System.out.println("Ammount debited");
            }
            else
            {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println(" Please enter valid crediantiols");
        }
    }

    public void deposit(int accno, int pin, double amt)
    {
        if(this.accno==accno && this.pin==pin)
        {
            System.out.println("Login successful");
            if(amt>0)
            {
                balance+=amt;
                System.out.println("ammount crediated");
            }
            else
            {
                System.out.println("invalid ammout");
            }
        }
        else
        {
            System.out.println(" please eneter valid crediantials");
        }
    }

    public double getBalance(int accno, int pin)
    {
        if(this.accno==accno && this.pin==pin)
        {
            System.out.println("login successful");
            return balance;
        }
        else
        {
            System.out.println(" please enter valid crediantials");
        }
        return 0;
    }

    public void setPin(int accno, int old, int updated)
    {
        if (this.accno==accno && pin==old)
        {
            pin=updated;
            System.out.println(" pin updated");
        }
        else
        {
            System.out.println("please enter vaid crediantials");
        }
    }
}
