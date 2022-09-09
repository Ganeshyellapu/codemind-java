import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        double r,pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        area=pi*r*r;
        System.out.format("%.2f",area);
    }
}