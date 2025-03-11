package Tejas.Method.MethodOverloading;

public class Instagram
{
    public static void main(String[] args)
    {
        //String photos;
        // String text;

        story();
        story("My pic" ,"Cute");

    }


    public static void story()
    {
        System.out.println("No story");
    }

    public static void story(String photos,String text )
    {
        System.out.println(photos);
    }
}
