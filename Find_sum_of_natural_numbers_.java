import java.util.Scanner;
class Natural
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}