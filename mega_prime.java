import java.util.*;
class Mega
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        int n,r;
        boolean a,b=false;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=isprime(n);
        while(n>0)
        {
           r=n%10;
           b=isprime(r);
           n=n/10;
        }
        if(a && b)
        {
            System.out.print("Mega Prime");
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
    }
}