import java.util.*;
class Generate
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
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
    }
}