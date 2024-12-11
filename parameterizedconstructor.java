import java.util.*;
class a{
    int c;
    String b;
    a(int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class parameterizedconstructor
{
    public static void main(String args[])
    {
        a s=new a(1517,"sana");
        s.display();
    }
}