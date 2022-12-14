import java.util.*;
class Super
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
        int[] b=new int[n];
        int ind=0;
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
        float s=0;
        float c=0;
        for(int i=0;i<ind;i++)
        {
            int k=count(b[i],arr);
            if(k==b[i])
            {
                s=s+b[i];
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
        else
        {
            float avg=s/c;
            System.out.print(String.format("%.2f",avg));
        }
        
    }
}