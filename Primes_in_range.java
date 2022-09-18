import java.util.*;
class Prime
{
    public static boolean prime(int i)
    {
        if(i==1)
        {
            return false;
        }
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,m,c=0,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            
            if(prime(i))
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}