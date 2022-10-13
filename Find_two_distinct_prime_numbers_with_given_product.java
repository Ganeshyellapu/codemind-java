import java.util.*;
class Distinct_primes
{
    public static boolean isprime(int k)
    {
        if(k==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(k);i++)
            {
                if(k%i==0)
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
        int a=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(isprime(i) && isprime(j))
                {
                    if(i*j==n)
                    {
                        a+=1;
                        System.out.print(i+" "+j);
                    }
                } 
            }
            if(a>0)
            {
               break; 
            }
        }
        if(a==0)
        {
            System.out.print(-1);
        }
    }
}