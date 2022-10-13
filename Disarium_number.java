import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        int n,d,temp,r,pow=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            pow=(int)(pow+(Math.pow(r,d)));
            d--;
            temp=temp/10;
        }
        if(pow==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}