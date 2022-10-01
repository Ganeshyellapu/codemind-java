import java.util.*;
class Battle
{
    public static boolean isprime(int n)
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
    public static void main(String args[])
    {
        int n1,n2,n3,sum;
        Scanner sc=new Scanner (System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=n1+n2;
        for(int i=1;i<n3;i++)
        {
            sum=n3+i;
            if(isprime(sum))
            {
                System.out.print(i);
                break;
            }
        }
    }
}