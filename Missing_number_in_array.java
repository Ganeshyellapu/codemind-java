import java.util.*;
class Missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n-1;i++)
            {
                arr[i]=sc.nextInt();
                a.add(arr[i]);
            }
            for(int i=1;i<=n;i++)
            {
                if(a.contains(i))
                {
                    continue;
                }
                else
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}