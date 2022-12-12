import java.util.*;
class Almost
{
    public static boolean isprime(int k)
    {
        for(int i=2;i<=(int)Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++)
        {
            int n=sc.nextInt();
            //System.out.println(n);
            int l=0;
            for(int i=2;i<n;i++)
            {
                if(isprime(i))
                {
                    for(int j=i+1;j<n;j++)
                    {
                        if(isprime(j))
                        {
                            if(j*i==n)
                            {
                                l=1;
                                System.out.println("YES");
                            }
                        }
                    }
                }
            }
            if(l==0)
            {
                System.out.println("NO");
            }
        }
    }
}