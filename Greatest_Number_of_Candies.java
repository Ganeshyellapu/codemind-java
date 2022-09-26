import java.util.*;
class Candies
{
    public static void main(String args[])
    {
        int n,a,max;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        String[] arr1=new String[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=arr[i]+a;
           if(arr[i]>=max)
           {
               arr1[i]="True";
           }
           else
           {
               arr1[i]="False";
           }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}