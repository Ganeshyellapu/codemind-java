import java.util.*;
class Ctt
{
    public static boolean isprime(int k)
    {
        if(k==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<k;i++)
            {
                if(k%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[min])
            {
                min=i;
            }
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        int c=0;
        for(int i=Math.min(min,max);i<=Math.max(min,max);i++)
        {
            if(isprime(arr[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}