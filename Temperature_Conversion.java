import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        f=((c*(1.8))+32);
        System.out.format("%.2f",f);
        
    }
}