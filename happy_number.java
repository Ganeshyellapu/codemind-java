import java.util.*;
class Happy
{
    public static boolean ishappy(int n)
    {
        int r,sum=0,temp;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+(r*r);
            temp=temp/10;
        }
        if(sum<10)
        {
            if(sum==1 || sum==7)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    return ishappy(sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(ishappy(n))
        {
          System.out.print("True");  
        }
        else
        {
            System.out.print("False");
        }
        
    }
}