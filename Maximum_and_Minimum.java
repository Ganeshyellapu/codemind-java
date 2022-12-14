import java.util.*;
class Ct
{
    public static int count(int k,int[] a)
    {
        int ct=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                ct+=1;
            }
        }
        return ct;
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
        int ind=0;
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                b[ind++]=arr[i];
            }
        }
        int max=b[0];
        int min=b[0];
        int c=0;
        for(int i=0;i<ind;i++)
        {
            if(count(b[i],arr)==b[i])
            {
                c+=1;
                if(b[i]<min)
                {
                    min=b[i];
                }
                if(b[i]>max)
                {
                    max=b[i];
                }
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(min+" "+max);   
        }
    }
}