import java.util.*;
class Element_count
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
              }
           }
           if(f==0)
           {
               b[index]=arr[i];
               index++;
           }
        }
        for(int i=0;i<index;i++)
        {
            System.out.print(b[i]+" "+count(b[i],arr)+" ");
        }
    }
}
