import java.util.*;
public class thistoaccessclassmem
{
    void display()
    {
        System.out.println("HELLO STUDENTS");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[])
    {
        thistoaccessclassmem r=new thistoaccessclassmem();
        r.dis1();
    }
}