import java.util.*;
class Monk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=0;
            for(int i=0;i<m+1;i++)
            {
                long temp=(long)i*i;
                if(temp%m==n)
                {
                    System.out.println(i);
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(-1);
            }
        }
    }
}