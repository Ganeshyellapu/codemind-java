import java.util.*;
class Maximum
{
    public static void main(String args[])
    {
        int n,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int max=arr[0];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=b && arr[i]>=a)
            {
                if(arr[i]>=max)
                {
                    max=arr[i];
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
            System.out.print(max);
        }
    }
}