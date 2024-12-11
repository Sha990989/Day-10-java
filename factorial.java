//finding factorial using recursion
public class factorial {
    int sum(int n)
    {
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main(String args[])
    {
        factorial r=new factorial();
        int res=r.sum(10);
        System.out.println(res);
    }

    
}
