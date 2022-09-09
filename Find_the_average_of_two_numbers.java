import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float a,b,avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        avg=(a+b)/2;
        System.out.format("%.4f",avg);
    }
}