import java.util.*;
class Sum_btw
{
    public static void main(String args[])
    {
        int n,a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=b && arr[i]>=a)
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}