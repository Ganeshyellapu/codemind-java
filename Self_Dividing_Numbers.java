import java.util.*;
class Self
{
    public static boolean selfd(int n)
    {
        int r,temp;
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            if(r==0)
            {
                return false;
            }
            if(n%r!=0)
            {
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(selfd(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}