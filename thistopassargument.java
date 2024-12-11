//used the pass as an argument
import java.util.*;
public class thistopassargument {
    String name;
    thistopassargument(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        thistopassargument o=new thistopassargument("sai");
        o.agt();
    }
}
class teacher{
    public void teach(thistopassargument s)
    {
        s.dis1();
    }
}