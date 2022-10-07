import java.util.*;
class Count
{
    public static void main(String args[])
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}