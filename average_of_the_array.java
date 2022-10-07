import java.util.*;
class Average
{
    public static void main(String args[])
    {
        int n;
        double avg,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.format("%.2f",avg);
    }
}