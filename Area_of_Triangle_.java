import java.lang.Math;
import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        double a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        
    }
}