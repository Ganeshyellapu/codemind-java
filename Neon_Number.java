import java.util.*;
class Neon
{
    public static void main(String args[])
    {
        int n,sq,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        temp=sq;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}