import java.util.*;
class Kth_sum
{
    public static void main(String args[])
    {
        int n,sum=0,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}