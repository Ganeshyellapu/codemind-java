import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
         int c=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]%k==0)
           {
               c+=1;
           }
        }
        System.out.print(c);
    }
}