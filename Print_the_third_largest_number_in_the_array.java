import java.util.*;
class Maxi
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
            int ind=0;
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
                    b[ind++]=arr[i];
                }
            }
            if(ind>=3)
            {
                System.out.print(b[ind-3]);
            }
            else
            {
                System.out.println("It is not possible");
            }
    }
}