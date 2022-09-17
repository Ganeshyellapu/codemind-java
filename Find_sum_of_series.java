import java.util.*;
class Series
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double sum=0;
        for(i=1;i<=n;i++)
        {
            sum+=Math.pow(i,-1);
        }
        System.out.format("%.2f",sum);
    }
}