public class recursionnaturalnumsum {
    int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[])
    {
        recursionnaturalnumsum ob=new recursionnaturalnumsum ();
        int res=ob.sum(10);
        System.out.println(res);
    }
    
}
