import java.util.*;
class Palindrome
{
    public static boolean ispal(int n)
    {
        int temp,r,rev=0;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(n!=rev)
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            if(ispal(n))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}