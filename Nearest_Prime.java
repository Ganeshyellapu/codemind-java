import java.util.*;
class Nearest_prime
{
    public static boolean isprime(int r)
    {
        if(r==1)
        {
            return false;
        }
        else
        {
            for(int f=2;f<=Math.sqrt(r);f++)
            {
                if(r%f==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int p1=0;
            for(int j=n;j>0;j--)
            {
               if(isprime(j))
               {
                   p1=j;
                   break;
               }
            }
            //System.out.println(p1);
            int p2=0;
            for(int k=n;k<n*n;k++)
            {
                if(isprime(k))
                {
                    p2=k;
                    break;
                }
            }
            //System.out.println(p1+" "+p2);
            int a=Math.abs(p1-n);
            int b=Math.abs(p2-n);
            if(a>b)
            {
                System.out.println(p2);
            }
            else
            {
                System.out.println(p1);
            }
        }
    }
}