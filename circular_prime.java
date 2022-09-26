import java.util.*;
class Circular
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
          for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true; 
    }
    public static void main(String args[])
    {
        int n,rev=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean a=isprime(n);
        while(n>0)
        {
          r=n%10;
          rev=rev*10+r;
          n=n/10;
        }
        boolean b=isprime(rev);
        if(a && !b)
        {
            System.out.print("prime but not a circular prime");
        }
        else if(a && b)
        {
            System.out.print("circular prime");
        }
        else
        {
            System.out.print("not prime");
        }
    }
}