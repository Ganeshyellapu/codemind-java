import java.util.*;
class Majority
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
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int index=0;
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
               b[index]=arr[i];
               index++;
           }
       }
       int k=0;
       for(int i=0;i<index;i++)
       {
            if(count(b[i],arr)>(n/2))
            {
                /*if(count(b[i],arr)>count(b[k],arr))
                {
                    k=i;
                }*/
                System.out.print(b[i]);
                break;
            }
       }
       //System.out.print(b[k]);
    }
}