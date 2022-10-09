import java.util.*;
class Elements
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=b && arr[i]>=a)
            {
                System.out.print(arr[i]+" ");
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}