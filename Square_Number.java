import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int n,c=0,pro1,pro2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                pro1=i*i;
                pro2=j*j;
                if(pro1+pro2==n)
                {
                    c+=1;
                }
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}