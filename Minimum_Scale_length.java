import java.util.*;
class Minimum
{
    public static int hcf(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        int n,i,v;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        v=arr[0];
        for(i=1;i<n;i++)
        {
            v=hcf(arr[i],v);
        }
        System.out.print(v);
    }
}