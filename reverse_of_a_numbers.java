import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,r,rev=0;
        temp=n;
        while(temp>0)
        {
           r=temp%10;
           rev=rev*10+r;
           temp=temp/10;
        }
        System.out.print(rev);
    }
}