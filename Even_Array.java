import java.util.*;
class Even_array
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
           if(arr[i]%2==0)
           {
               c+=1;
           }
        }
        if(c==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}