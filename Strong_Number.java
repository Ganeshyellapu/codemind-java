import java.util.*;
class Strong
{
    public static void main(String args[])
    {
        int n,temp,total=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            int i=1;
            int fact=1;
            r=temp%10;
            while(i<=r)
            {
                fact=fact*i;
                i++;
            }
            total=total+fact;
            temp=temp/10;
        }
        if(total==n)
        {
            System.out.format("The number %d is a strong number",n);
        }
        else
        {
            System.out.format("The number %d is not a strong number",n);
        }
    }
}