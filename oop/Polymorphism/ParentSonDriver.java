package Tejas.oop.Polymorphism;

public class ParentSonDriver
{
    public static void main(String[] args)
    {
        Parent p1 =new Son();
        p1.finance();
        p1.title(); // When parent and child has the same method
        // then at the run time compiler gives perfrence to the child class method
    }
}
