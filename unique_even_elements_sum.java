import java.util.*;
class U_even_sum
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
        int sum=0;
        for(int i=0;i<index;i++)
        {
          if(b[i]%2==0)
          {
              sum=sum+b[i];
          }
        }
        System.out.print(sum);
    }
}