import java.util.*;
class Fibb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        int k=2;
        for(int i=2;i<a;i++)
        {
            arr[i]=arr[0]+arr[1];
            System.out.print(arr[i]+" ");
            arr[0]=arr[1];
            arr[1]=arr[i];
        }
    }
}