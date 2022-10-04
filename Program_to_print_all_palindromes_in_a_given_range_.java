import java.util.*;
class Palindrome
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
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(ispal(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}