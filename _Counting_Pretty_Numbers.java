import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int d,c=0;
           int l=sc.nextInt();
           int r=sc.nextInt();
            for(int j=l;j<=r;j++)
            {
                d=j%10;
                if(d==2 || d==3 || d==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}