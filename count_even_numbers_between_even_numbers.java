import java.util.*;
class Mid_even
{
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i-1>=0 && i+1<n)
            {
                if(arr[i-1]%2==0 && arr[i]%2==0 && arr[i+1]%2==0)
                {
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}