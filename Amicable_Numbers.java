import java.util.*;
class Amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,sum1=0,sum2=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
              sum1=sum1+i;  
            }
        }
        for(int j=1;j<m;j++)
        {
            if(m%j==0)
            {
                sum2=sum2+j;
            }
        }
        if(sum1==m && sum2==n)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}