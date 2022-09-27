import java.util.*;
class Spy
{
    public static void main(String args[])
    {
        int n,r,sum=0,pro=1,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r;
            pro=pro*r;
            temp=temp/10;
        }
        if(sum==pro)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}