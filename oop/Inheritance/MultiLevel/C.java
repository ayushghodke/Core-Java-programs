//MultiLevel Inheritance, In this we have one super class
// who is having one subclass and that sublass is having another sublass
package Tejas.oop.Inheritance.MultiLevel;
import Tejas.oop.Inheritance.SingalLevel.B1;
public class C extends B1
{
 String s="Tech in air";
 public void showC()
 {
     System.out.println(s);
     System.out.println("Class C is executing");
 }
}
