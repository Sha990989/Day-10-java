import java.util.*;
public class constructoroverloading
{
    String name;
    constructoroverloading()
    {
        name="sai";
    }
    constructoroverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        constructoroverloading r=new constructoroverloading();
        r.display();
        constructoroverloading r1=new constructoroverloading("kumar");
        r1.display();
    }
}