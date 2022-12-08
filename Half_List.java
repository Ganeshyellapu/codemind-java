import java.util.*;
class Half
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int h=n/2;
        int[] b=new int[h];
        int[] c=new int[h];
        int j=0;
        for(int i=n-1;i>=h;i--)
        {
                b[j]=arr[i];
                j+=1;
        }
        for(int i=0;i<h;i++)
        {
               c[i]=arr[i];
        }
        for(int i=0;i<h;i++)
        {
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<h;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}