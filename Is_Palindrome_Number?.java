import java.util.*;
class Palindrome
{
    public static boolean ispal(int k)
    {
        int r,rev=0,temp;
        temp=k;
        while(temp!=0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(rev==k)
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
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(ispal(n))
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}