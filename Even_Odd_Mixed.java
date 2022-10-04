import java.util.*;
class Mixed
{
    public static void main(String args[])
    {
        int n,r,e=0,o=0,m=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                e+=1;
            }
            else if(r%2!=0)
            {
                o+=1;
            }
            else
            {
                m+=1;
            }
            n=n/10;
            c+=1;
        }
        if(c==e)
        {
            System.out.print("Even");
        }
        else if(c==o)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}