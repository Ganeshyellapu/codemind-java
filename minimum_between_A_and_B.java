import java.util.*;
class Minimum
{
    public static void main(String args[])
    {
        int n,min,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        min=arr[n-1];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=b && arr[i]>=a)
            {
                if(arr[i]<=min)
                {
                    min=arr[i];
                    c+=1;
                }
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(min);
        }
        
    }
}