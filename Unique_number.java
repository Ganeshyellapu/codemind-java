import java.util.*;
class Unique
{
    public static void main(String args[])
    {
        int n,temp1,temp2,r1,r2,d=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp1=n;
        
        while(temp1>0)
        {
            int c=0;
            temp2=n;
            r1=temp1%10;
            while(temp2>0)
            {
                r2=temp2%10;
                if(r1==r2)
                {
                    c+=1;
                }
                temp2=temp2/10;
            }
            temp1=temp1/10;
            if(c>1)
            {
                d+=1;
            }
        }
        if(d==0)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
    }
}