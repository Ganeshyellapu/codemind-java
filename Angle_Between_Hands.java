import java.util.Scanner;
import java.lang.Math;
class Angle
{
    public static void main(String args[])
    {
        String time,hours,min;
        double a,d;
        Scanner sc=new Scanner(System.in);
        time=sc.next();
        String[] angle=time.split(":");
        hours=angle[0];
        min=angle[1];
        int h=Integer.parseInt(hours);
        int m=Integer.parseInt(min);
        a=Math.abs((30*h)-(5.5*m));
        d=360-a;
        System.out.print(Math.min(a,d));
    }
}