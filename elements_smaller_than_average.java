import java.util.*;
class Elements_small_avg
{
    public static void main(String args[])
    {
        int n,sum=0,avg;
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}