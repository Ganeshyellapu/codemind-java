import java.util.*;
class Closest_prime
{
    public static boolean isprime(int r)
    {
        if(r==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(r);i++)
            {
                if(r%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isprime(n))
        {
            System.out.print(0);
        }
        else
        {
            int k=0;
            for(int i=n;i>0;i--)
            {
                if(isprime(i))
                {
                    k=i;
                    break;
                }
            }
            int f=0;
            for(int j=n;j<n*n;j++)
            {
                if(isprime(j))
                {
                    f=j;
                    break;
                }
            }
            //System.out.print(k+" "+f);
            int a,b;
            a=Math.abs(n-k);
            b=Math.abs(n-f);
            if(a>b)
            {
                System.out.print(b);
            }
            else
            {
                System.out.print(a);
            }
        }
    }
}