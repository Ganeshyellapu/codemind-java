import java.util.*;
class count_value
{
    public static int count(int k,int[] a)
    {
        int ct=0;
        for(int j=0;j<a.length;j++)
        {
            if(a[j]==k)
            {
                ct+=1;
            }
        }
        return ct;
    }
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
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
               b[ind]=arr[i];
               ind++;
            }
        }
        for(int i=0;i<ind;i++)
        {
           if(b[i]==count(b[i],arr)) 
           {
               c+=1;
           }
        }
        System.out.print(c);
    }
}