import java.util.*;
class Primes_greater
{
    public static boolean isprime(int n)
    {
        if(n==1)
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
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(isprime(arr[i]))
            {
                if(arr[i]>=k)
                {
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}