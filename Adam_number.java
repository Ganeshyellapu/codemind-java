import java.util.*;
class Adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq,rev=0,temp,temp1,rs,r,ag=0;
        sq=n*n;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        rs=rev*rev;
        temp1=rs;
        while(temp1>0)
        {
            r=temp1%10;
            ag=ag*10+r;
            temp1=temp1/10;
        }
        if(sq==ag)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}