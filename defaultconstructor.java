import java.util.*;
class a{
    int c;
    String b;
    a()
    {
        this.c=345;
        this.b="shalini";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class defaultconstructor
{
    public static void main(String args[])
    {
        a s=new a();
        s.display();
    }
}