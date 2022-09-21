import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int n,temp,rev=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}