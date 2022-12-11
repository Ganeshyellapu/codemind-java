import java.util.*;
class Wave
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
        Arrays.sort(arr);
        int k=n/2;
        int l=0;
        for(int i=0;i<k;i++)
        {
           System.out.print(arr[n-l-2]+" ");
           System.out.print(arr[n-l-1]+" ");
           l+=2;
        }
        if(n%2!=0)
        {
            System.out.println(arr[0]);
        }
    }
}