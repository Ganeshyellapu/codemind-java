import java.util.*;
class Interest
{
    public static void main(String args[])
    {
        int p,t,r,i;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        i=(p*t*r)/100;
        System.out.print(i);
    }
}