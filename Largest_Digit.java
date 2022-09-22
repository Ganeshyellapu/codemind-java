import java.util.*;
class Largest
{
    public static void main(String args[])
    {
        int n,r,lar=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(lar<r)
            {
                lar=r;
            }
            n=n/10;
        }
        System.out.print(lar);
    }
}