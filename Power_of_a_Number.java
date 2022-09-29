import java.util.*;
class Power
{
    public static void main(String args[])
    {
        int x,y,z,sum,mod;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sum=(int)Math.pow(x,y);
        mod=sum%z;
        System.out.print(mod);
    }
}