import java.util.*;
class PrimePal
{
    public static boolean ispal(int n)
    {
        int temp,rev=0,r;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(rev==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        else
        {
           for(int i=2;i<n;i++)
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
        int n,sq;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        for(int i=n+1;i<=sq;i++)
        {
            if(isprime(i))
            {
                if(ispal(i))
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}